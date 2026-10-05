package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()));
    Object v3 = true;
    Object v4 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    ((com.google.javascript.jscomp.TypeValidator)v0).setShouldReport((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = null;
    Object v12 = "S";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = null;
    Object v12 = "N$";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getJsDocBuilderForNode();
    Object v12 = null;
    Object v13 = "!";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isSyntheticBlock();
    Object v4 = true;
    Object v5 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()));
    Object v3 = "z";
    ((com.google.javascript.rhino.Node)v2).addSuppression(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    ((com.google.javascript.jscomp.TypeValidator)v0).setShouldReport((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = true;
    Object v5 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.TypeValidator)v0).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.FunctionType)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = null;
    Object v15 = ": ";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSideEffectFlags();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = true;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "ASSIGN_RIV";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).hasScope();
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = null;
    Object v15 = "D";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "O";
    Object v4 = "proteotype";
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v6 = 0;
    Object v7 = 194;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v4),((java.io.InputStream)v8));
    Object v10 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v10));
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = "u";
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope.Var)v19),((java.lang.String)v20),((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "}";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ((com.google.javascript.jscomp.TypeValidator)v2).getMismatches();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "}";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 0.0D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = "The call ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v20),((java.lang.String)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "K";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = -12;
    ((com.google.javascript.rhino.Node)v12).setChangeTime((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = null;
    Object v16 = "  ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = true;
    ((com.google.javascript.jscomp.TypeValidator)v2).setShouldReport((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "}";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"R","(",""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = 0.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = null;
    Object v21 = ".pro~totype.";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.JSType)v20),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    Object v14 = null;
    Object v15 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = " #";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "Y";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "We can only sort lexical scopes";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "b";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.FunctionType)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = ":";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "Regxp";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "mDate";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -29;
    ((com.google.javascript.rhino.Node)v4).setLineno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v4).isEquivalentToTyped(((com.google.javascript.rhino.Node)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "undefined";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "JSCompiler_renameProperty";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "proteotype";
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v6 = 0;
    Object v7 = 194;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v4),((java.io.InputStream)v8));
    Object v10 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v10));
    Object v12 = ((com.google.javascript.jscomp.CompilerInput)v11).getSourceFile();
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v19));
    Object v21 = "";
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope.Var)v20),((java.lang.String)v21),((com.google.javascript.rhino.jstype.JSType)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v10).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.FunctionType)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    ((com.google.javascript.jscomp.TypeValidator)v2).setShouldReport((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "y";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "JSCompiler_rena!meProperty";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v14 = "}";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"2","deadAssignmentsEliminati","JSC_WRONG_ARGUMNT_COUNT"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 0.0D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v20),((java.lang.String)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "bolean";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).getScope();
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.FunctionType)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "moduble";
    Object v4 = "proteotype";
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v6 = 0;
    Object v7 = 194;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v4),((java.io.InputStream)v8));
    Object v10 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v10));
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = "";
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope.Var)v19),((java.lang.String)v20),((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "%";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "this";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "B";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isVarArgs();
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v10).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = null;
    Object v17 = "'";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.JSType)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isQualifiedName();
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v14 = "}";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 0.0D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = "G";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v20),((java.lang.String)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setVarArgs((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v4).srcref(((com.google.javascript.rhino.Node)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "(";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "'";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).hasScope();
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = null;
    Object v15 = "*gtobal*";
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.TypeValidator)v2).expectNotNullOrUndefined(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15),((com.google.javascript.rhino.jstype.JSType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setIsSyntheticBlock((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isVarArgs();
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "X";
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.TypeValidator)v2).expectNotNullOrUndefined(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.JSType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = ")";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).wasEmptyNode();
    Object v14 = null;
    Object v15 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getProp((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getDirectives();
    Object v14 = null;
    Object v15 = "B";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v4).checkTreeEquals(((com.google.javascript.rhino.Node)v6));
    Object v8 = false;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "o";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "K";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectCanCast(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "!";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).mayMutateGlobalStateOrThrow();
    Object v14 = null;
    Object v15 = "DISPOSE";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "proteotype";
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v6 = 0;
    Object v7 = 194;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v4),((java.io.InputStream)v8));
    Object v10 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v10));
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = "a";
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope.Var)v19),((java.lang.String)v20),((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v10).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = null;
    Object v17 = "runCustomPasses";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.JSType)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 49;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getIntProp((((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "protot";
    Object v4 = "proteotype";
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v6 = 0;
    Object v7 = 194;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v4),((java.io.InputStream)v8));
    Object v10 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v10));
    Object v12 = ((com.google.javascript.jscomp.CompilerInput)v11).isExtern();
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v19));
    Object v21 = "";
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope.Var)v20),((java.lang.String)v21),((com.google.javascript.rhino.jstype.JSType)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getDirectives();
    Object v14 = null;
    Object v15 = "Constuctor {0} should be called with the \"new\" keyword";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = " ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getLength();
    Object v14 = "n";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).checkTreeEquals(((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.FunctionType)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "JSCompiler_lcov_instrumentedLines";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 0.0D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -50;
    ((com.google.javascript.rhino.Node)v4).setChangeTime((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "O";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = "i";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = "[";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).hasScope();
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = null;
    Object v15 = " TOTAL ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.StrictModeCheck(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v7),((com.google.javascript.jscomp.ScopeCreator)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = null;
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectIndexMatch(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
