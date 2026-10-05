package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
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
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = "l";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = "JSC_UNKNOWN_TYgPEOF_VALUE";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.rhino.IR.thisNode();
    Object v2 = false;
    Object v3 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.rhino.IR.thisNode();
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = " A";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = "";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    ((com.google.javascript.jscomp.TypeValidator)v0).setShouldReport((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = new java.util.TreeSet();
    ((com.google.javascript.rhino.Node)v8).setDirectives(((java.util.Set)v9));
    Object v10 = null;
    Object v11 = null;
    Object v12 = ">";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = "|";
    Object v11 = ((com.google.javascript.jscomp.TypeValidator)v0).expectObject(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = "functio)n";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = "";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    ((com.google.javascript.jscomp.TypeValidator)v0).setShouldReport((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.rhino.IR.thisNode();
    Object v2 = "\nMemory usage";
    Object v3 = new com.google.javascript.rhino.InputId(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).setInputId(((com.google.javascript.rhino.InputId)v3));
    Object v4 = null;
    Object v5 = true;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.rhino.IR.thisNode();
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = ((com.google.javascript.rhino.Node)v1).isEquivalentToTyped(((com.google.javascript.rhino.Node)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.jscomp.TypeValidator)v0).getReadableJSTypeName(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = ":";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = null;
    Object v10 = "$";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectString(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.rhino.Node)v8).isVarArgs();
    Object v10 = null;
    Object v11 = "}";
    ((com.google.javascript.jscomp.TypeValidator)v0).expectString(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v10),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = false;
    Object v5 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = true;
    Object v5 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).isEquivalentToTyped(((com.google.javascript.rhino.Node)v4));
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = "5";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    Object v14 = " type: ";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.rhino.Node)v3).detachChildren();
    Object v4 = null;
    Object v5 = true;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = "U";
    Object v12 = "LEGACY";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"","E"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = com.google.javascript.rhino.IR.thisNode();
    Object v17 = 15;
    Object v18 = ((com.google.javascript.rhino.Node)v16).getBooleanProp((((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = "!";
    Object v21 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.JSType)v19),((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "JSC_INVALID_CAST";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
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
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getEnclosingFunction();
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = null;
    Object v13 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectIndexMatch(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.FunctionType)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = "\nMemory usage";
    Object v5 = new com.google.javascript.rhino.InputId(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v3).setInputId(((com.google.javascript.rhino.InputId)v5));
    Object v6 = null;
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = false;
    ((com.google.javascript.rhino.Node)v3).setIsSyntheticBlock((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectCanCast(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v12));
    Object v13 = null;
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
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = null;
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.TypeValidator)v2).expectCanAssignTo(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "<";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = "JRSCompiler_ObjectPropertyString";
    ((com.google.javascript.rhino.Node)v10).setSourceFileForTesting(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = null;
    Object v14 = "pazckage";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getQualifiedName();
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = ((com.google.javascript.rhino.Node)v10).getInputId();
    Object v12 = null;
    Object v13 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = "|";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ((com.google.javascript.jscomp.TypeValidator)v2).getMismatches();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).isSyntheticBlock();
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getAncestors();
    Object v5 = true;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = true;
    ((com.google.javascript.jscomp.TypeValidator)v2).setShouldReport((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    ((com.google.javascript.jscomp.TypeValidator)v2).setShouldReport((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAllInterfaceProperties(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.FunctionType)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneNode();
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = ": ";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "argum&ents";
    Object v4 = "call";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v10));
    Object v12 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = "JSC_BAD_PRIVATE";
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope.Var)v12),((java.lang.String)v13),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeFirstChild();
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "...";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "me";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ":E";
    Object v4 = "call";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = 7;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getIntProp((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = "argum&ents";
    Object v16 = "call";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = com.google.javascript.rhino.IR.thisNode();
    Object v21 = com.google.javascript.rhino.IR.thisNode();
    Object v22 = com.google.javascript.rhino.IR.thisNode();
    Object v23 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = "JSC_BAD_PRIVATE";
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.TypeValidator)v14).expectUndeclaredVariable(((java.lang.String)v15),((com.google.javascript.jscomp.CompilerInput)v19),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope.Var)v24),((java.lang.String)v25),((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = "\n";
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope.Var)v27),((java.lang.String)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = null;
    Object v13 = ":";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).wasEmptyNode();
    Object v5 = true;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "mismatch of the {0} property type and the type of the property it overrides from superclass {1}\nori%inal: {2}\noverride: {3}";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.rhino.Node)v3).addChildrenToBack(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = null;
    Object v13 = "^";
    Object v14 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = -1;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getBooleanProp((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectAnyObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
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
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = ((com.google.javascript.rhino.Node)v10).isSyntheticBlock();
    Object v12 = null;
    Object v13 = "-";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectNumber(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "U";
    Object v13 = "LEGACY";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.rhino.IR.thisNode();
    Object v18 = null;
    Object v19 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectCanCast(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.jstype.JSType)v19));
    Object v20 = null;
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
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = null;
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = -2;
    ((com.google.javascript.rhino.Node)v3).setLength((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ",";
    Object v4 = "call";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v6));
    Object v8 = "call";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    ((com.google.javascript.jscomp.CompilerInput)v7).setSourceFile(((com.google.javascript.jscomp.SourceFile)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v15));
    Object v17 = "t";
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope.Var)v16),((java.lang.String)v17),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v3).appendStringTree(((java.lang.Appendable)v4));
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "x)";
    Object v4 = "call";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v10));
    Object v12 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = "";
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope.Var)v12),((java.lang.String)v13),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "%";
    Object v4 = "call";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v6));
    Object v8 = "call";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    ((com.google.javascript.jscomp.CompilerInput)v7).setSourceFile(((com.google.javascript.jscomp.SourceFile)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v15));
    Object v17 = "";
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope.Var)v16),((java.lang.String)v17),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = "";
    ((com.google.javascript.rhino.Node)v3).setSourceFileForTesting(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).wasEmptyNode();
    Object v5 = false;
    Object v6 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "BANG";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectBitwiseable(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = false;
    ((com.google.javascript.rhino.Node)v3).setVarArgs((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "]";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectStringOrNumber(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).srcref(((com.google.javascript.rhino.Node)v4));
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "\n";
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.TypeValidator)v2).expectNotNullOrUndefined(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12),((com.google.javascript.rhino.jstype.JSType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = "prototype";
    ((com.google.javascript.rhino.Node)v3).setSourceFileForTesting(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = -6;
    ((com.google.javascript.rhino.Node)v3).setLineno((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = 1;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getProp((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = ((com.google.javascript.rhino.Node)v10).isEquivalentToTyped(((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    Object v14 = "b";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectString(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).useSourceInfoFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = null;
    Object v14 = "z";
    Object v15 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = ((com.google.javascript.rhino.Node)v10).toStringTree();
    Object v12 = "proPotype";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = "";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectValidTypeofName(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "\"";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = null;
    ((com.google.javascript.jscomp.TypeValidator)v2).expectSwitchMatchesCase(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = 0;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getBooleanProp((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "@";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).srcref(((com.google.javascript.rhino.Node)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.TypeValidator)v2).getReadableJSTypeName(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("this"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "w";
    ((com.google.javascript.jscomp.TypeValidator)v2).expectActualObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "7";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "winiow";
    Object v4 = "call";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v6));
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "x)";
    Object v14 = "call";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = com.google.javascript.rhino.IR.thisNode();
    Object v19 = com.google.javascript.rhino.IR.thisNode();
    Object v20 = com.google.javascript.rhino.IR.thisNode();
    Object v21 = com.google.javascript.jscomp.Scope.createGlobalScope(((com.google.javascript.rhino.Node)v20));
    Object v22 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v21));
    Object v23 = "";
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.TypeValidator)v12).expectUndeclaredVariable(((java.lang.String)v13),((com.google.javascript.jscomp.CompilerInput)v17),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v19),((com.google.javascript.jscomp.Scope.Var)v22),((java.lang.String)v23),((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.jscomp.Scope.Var)v25).isNoShadow();
    Object v27 = "";
    Object v28 = null;
    Object v29 = ((com.google.javascript.jscomp.TypeValidator)v2).expectUndeclaredVariable(((java.lang.String)v3),((com.google.javascript.jscomp.CompilerInput)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope.Var)v25),((java.lang.String)v27),((com.google.javascript.rhino.jstype.JSType)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.TypeValidator(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = null;
    Object v12 = "D";
    Object v13 = ((com.google.javascript.jscomp.TypeValidator)v2).expectObject(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
