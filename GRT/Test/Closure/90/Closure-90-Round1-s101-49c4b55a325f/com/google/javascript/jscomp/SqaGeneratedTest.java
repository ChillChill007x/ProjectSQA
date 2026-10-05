package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = 1;
    Object v3 = -10;
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "MSG@";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "cal";
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = "";
    Object v9 = "/";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"boolean",""};
    Object v12 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).report(((com.google.javascript.jscomp.JSError)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = 1;
    Object v16 = -10;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "UNMAQPED";
    Object v19 = "";
    Object v20 = 1;
    Object v21 = -10;
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v17),((java.lang.String)v18),((com.google.javascript.jscomp.Scope)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "Only one parameter type must be the template type";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getTopScope();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "nul";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "2";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = 1;
    Object v3 = -10;
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    Object v6 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferParameterTypes(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.JSDocInfo)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Inlining empty methBod: ";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getVar(((java.lang.String)v16));
    Object v18 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "AssignExpr";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "null";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "%";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "JSC_BAD_J";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "cal";
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = "";
    Object v9 = "/";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"boolean",""};
    Object v12 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).report(((com.google.javascript.jscomp.JSError)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = 1;
    Object v16 = -10;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "";
    Object v19 = "";
    Object v20 = 1;
    Object v21 = -10;
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getVar(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v17),((java.lang.String)v18),((com.google.javascript.jscomp.Scope)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "U\n";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "prototype";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).containsDeclaration();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "string";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "+";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "V";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getOwnSlot(((java.lang.String)v16));
    Object v18 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "g";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "x?";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = -10;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "msg.XML.bad.form";
    Object v2 = ((com.google.javascript.rhino.JSDocInfo)v0).hasDescriptionForParameter(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "C";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "7";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = "ab";
    Object v3 = ((com.google.javascript.rhino.JSDocInfo)v1).getDescriptionForParameter(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "Referenced Names: ";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "arg";
    Object v6 = -5;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = 1;
    Object v10 = -10;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ")";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = -10;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "N";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "1";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "destructuring assignment forbidden";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "G";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "L";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.Scope)v15).getVars();
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "";
    Object v2 = ((com.google.javascript.rhino.JSDocInfo)v0).hasDescriptionForParameter(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "9";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = 1;
    Object v11 = -10;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v8).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = 1;
    Object v17 = -10;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v14),((com.google.javascript.jscomp.Scope)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "prototype";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "2";
    Object v6 = -3;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = 1;
    Object v10 = -10;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = " 4";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = -10;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "5";
    Object v2 = ((com.google.javascript.rhino.JSDocInfo)v0).getDescriptionForParameter(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Second argument must name a method.";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "";
    ((com.google.javascript.rhino.JSDocInfo)v0).setLicense(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = "prototype";
    Object v20 = ((com.google.javascript.rhino.JSDocInfo)v18).getParameterType(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = 1;
    Object v23 = -10;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferThisType(((com.google.javascript.rhino.JSDocInfo)v18),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = "";
    Object v21 = 1;
    Object v22 = -10;
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = "";
    Object v22 = 1;
    Object v23 = -10;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferThisType(((com.google.javascript.rhino.JSDocInfo)v20),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v20).getThrownTypes();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v20).getThrownTypes();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v23 = "";
    Object v24 = 1;
    Object v25 = -10;
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v22).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = "";
    Object v21 = 1;
    Object v22 = -10;
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "I";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = " is nul";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "cal";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = null;
    Object v21 = "";
    Object v22 = 1;
    Object v23 = -10;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferFromOverriddenFunction(((com.google.javascript.rhino.jstype.FunctionType)v20),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = "";
    Object v25 = 1;
    Object v26 = -10;
    Object v27 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v24).getDescriptionForParameter(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v24).getDescriptionForParameter(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v24).getDescriptionForParameter(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v27));
    Object v29 = "";
    Object v30 = 1;
    Object v31 = -10;
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v28).inferParameterTypes(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.rhino.JSDocInfo)v26).getThrownTypes();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v24).getDescriptionForParameter(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = "";
    Object v21 = 1;
    Object v22 = -10;
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).buildAndRegister();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
    ((com.google.javascript.rhino.JSDocInfo)v24).setVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).buildAndRegister();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "";
    Object v26 = 1;
    Object v27 = -10;
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferThisType(((com.google.javascript.rhino.JSDocInfo)v24),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = "";
    Object v28 = 1;
    Object v29 = -10;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferParameterTypes(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = null;
    Object v21 = "";
    Object v22 = 1;
    Object v23 = -10;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferFromOverriddenFunction(((com.google.javascript.rhino.jstype.FunctionType)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = "";
    Object v27 = 1;
    Object v28 = -10;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = "";
    Object v23 = 1;
    Object v24 = -10;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "";
    Object v27 = 1;
    Object v28 = -10;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "";
    Object v31 = 1;
    Object v32 = -10;
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    ((com.google.javascript.rhino.Node)v25).addChildAfter(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = "";
    Object v28 = 1;
    Object v29 = -10;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferParameterTypes(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.rhino.JSDocInfo)v33).getImplementedInterfaces();
    Object v35 = "";
    Object v36 = 1;
    Object v37 = -10;
    Object v38 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferThisType(((com.google.javascript.rhino.JSDocInfo)v33),((com.google.javascript.rhino.Node)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = null;
    Object v21 = "";
    Object v22 = 1;
    Object v23 = -10;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferFromOverriddenFunction(((com.google.javascript.rhino.jstype.FunctionType)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "!";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = "";
    Object v28 = 1;
    Object v29 = -10;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferParameterTypes(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).buildAndRegister();
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "";
    Object v24 = ((com.google.javascript.rhino.JSDocInfo)v22).hasDescriptionForParameter(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Function";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "";
    Object v24 = ((com.google.javascript.rhino.JSDocInfo)v22).hasDescriptionForParameter(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).getParameterNames();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v25).getImplementedInterfaceCount();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
    ((com.google.javascript.rhino.JSDocInfo)v24).setVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = "";
    Object v29 = 1;
    Object v30 = -10;
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.JSDocInfo)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
    ((com.google.javascript.rhino.JSDocInfo)v24).setVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = "";
    Object v29 = 1;
    Object v30 = -10;
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v27));
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.rhino.JSDocInfo)v29).getParameterNames();
    Object v31 = "";
    Object v32 = 1;
    Object v33 = -10;
    Object v34 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v28).inferThisType(((com.google.javascript.rhino.JSDocInfo)v29),((com.google.javascript.rhino.Node)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.Scope)v15).getVarCount();
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = "";
    Object v28 = 1;
    Object v29 = -10;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferParameterTypes(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = "EXPOR";
    Object v35 = ((com.google.javascript.rhino.JSDocInfo)v33).getDescriptionForParameter(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).getParameterNames();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 1;
    Object v7 = -10;
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "If this if/for/while really shouldn't have a body, use";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = -10;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v25).getImplementedInterfaceCount();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = -10;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "assign";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -10;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).containsDeclaration();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v26).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v27));
    Object v29 = "";
    Object v30 = 1;
    Object v31 = -10;
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v28).inferReturnStatementsAsLastResort(((com.google.javascript.rhino.Node)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
