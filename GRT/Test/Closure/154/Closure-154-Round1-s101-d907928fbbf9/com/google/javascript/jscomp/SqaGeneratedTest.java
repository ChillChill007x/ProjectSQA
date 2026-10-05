package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "_";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "_";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = false;
    Object v4 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "_";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = false;
    Object v5 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeValidator)v0).getMismatches();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Node.newString(((java.lang.String)v7));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).setType((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "k";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "intrfaceChecker";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.FunctionType)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "}";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "WKILE node";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).toStringTree();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ((com.google.javascript.jscomp.TypeValidator)v2).getMismatches();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((com.google.javascript.rhino.Node[])v9));
    Object v10 = null;
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    Object v14 = null;
    Object v15 = "(`";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    ((com.google.javascript.jscomp.TypeValidator)v2).setShouldReport((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v10).addChildToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.FunctionType)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.FunctionType)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "argu";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = "Un!expected token type. Should be LABEL_NAME.";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 11;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getAncestor((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = true;
    ((com.google.javascript.jscomp.TypeValidator)v2).setShouldReport((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "<antnymous>";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isUnscopedQualifiedName();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = ")";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setIsSyntheticBlock((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).toString();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isQualifiedName();
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "Zb";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = "_";
    Object v14 = com.google.javascript.rhino.Node.newString(((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v10).addChildAfter(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = null;
    Object v17 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setOptionalArg((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "y";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"&","L","?"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = "_";
    Object v18 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17));
    Object v19 = null;
    Object v20 = "";
    Object v21 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.JSType)v19),((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 21;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = "ms.no.brace.prop";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "[,";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneNode();
    Object v13 = null;
    Object v14 = ",";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "p";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "5";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = ".prototype";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "_";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).checkTreeEquals(((com.google.javascript.rhino.Node)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).toStringTree();
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).toString();
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "nul";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "Scope.Var ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"msg.jsdoc.fileoverview.extra","Unexpected e~pression node"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = "_";
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16));
    Object v18 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.FunctionType)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v4).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v5));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "d";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = "_";
    Object v18 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17));
    Object v19 = null;
    Object v20 = "prototyp/";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.JSType)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = ((com.google.javascript.jscomp.TypeValidator)v11).getMismatches();
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((java.util.List)v12));
    Object v13 = null;
    Object v14 = "_";
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14));
    Object v16 = null;
    Object v17 = "^";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.JSType)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "f}alse";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = "Q";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "V";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "JSCompiler_valias_FALSE";
    ((com.google.javascript.rhino.Node)v10).setString(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = null;
    Object v14 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "{";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "JSC_OPTIMIZE_LOOP_ERROR";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = 16;
    ((com.google.javascript.rhino.Node)v10).setLineno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.FunctionType)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    ((com.google.javascript.rhino.Node)v4).setDirectives(((java.util.Set)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).siblings();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isUnscopedQualifiedName();
    Object v12 = null;
    Object v13 = "HOOK";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "  ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = "_";
    Object v13 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12));
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.FunctionType)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "debugger";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setVarArgs((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "[";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getAncestors();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "}";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = ", ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "(";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "\n";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = null;
    Object v13 = "p&rototype";
    Object v14 = ((com.google.javascript.jscomp.TypeValidator)v2).expectCanAssignTo(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"."};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = "_";
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = "~";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.JSType)v18),((java.lang.String)v19));
    Object v20 = null;
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "ERROR_FUNCTION_TYPE";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectSwitchMatchesCase(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v12));
    Object v13 = null;
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"\\"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = "_";
    Object v18 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17));
    Object v19 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.FunctionType)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = "The new child node already ";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "_";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).checkTreeEquals(((com.google.javascript.rhino.Node)v6));
    Object v8 = false;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "_";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v4).addChildToBack(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).siblings();
    Object v12 = null;
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "X";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "U";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    ((com.google.javascript.rhino.Node)v4).setDirectives(((java.util.Set)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "_";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).clonePropsFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = false;
    Object v9 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = "g";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = 11;
    ((com.google.javascript.rhino.Node)v10).setType((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.FunctionType)v13));
    Object v14 = null;
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
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = ",";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
