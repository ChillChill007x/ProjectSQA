package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getAncestors();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "s";
    ((com.google.javascript.rhino.Node)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "publicq";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isOptionalParameter(((com.google.javascript.rhino.Node)v7));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CodingConvention)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v5).getExportPropertyFunction();
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).isEquivalentTo(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    ((com.google.javascript.rhino.Node)v1).detachChildren();
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    Object v6 = "publicq";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = java.util.Set.of(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v7));
    ((com.google.javascript.rhino.Node)v1).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toString();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "publicq";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = "publicq";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).clonePropsFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.TypedScopeCreator)v0).createScope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.Scope)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.rhino.Node)v1).setOptionalArg((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "eval";
    Object v3 = new java.io.PrintStream(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).appendStringTree(((java.lang.Appendable)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).copyInformationFrom(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -29;
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = new com.google.javascript.rhino.Node.SideEffectFlags();
    ((com.google.javascript.rhino.Node)v1).putProp((((java.lang.Integer)v2).intValue()),((java.lang.Object)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = "publicq";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v1).addChildAfter(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeEquals(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getTopScope();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -25;
    Object v3 = 0;
    ((com.google.javascript.rhino.Node)v1).putIntProp((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.rhino.Node)v1).setVarArgs((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "";
    Object v6 = 0;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceRegion(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v5).getGlobalObject();
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeChildren();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isUnscopedQualifiedName();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).clonePropsFrom(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getDeclarativelyUnboundVarsWithoutTypes();
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getArgumentsVar();
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getQualifiedName();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "{.prototype";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getVar(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -63;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ">";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getVar(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 11;
    Object v3 = "publicq";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.rhino.Node)v1).putProp((((java.lang.Integer)v2).intValue()),((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getJsDocBuilderForNode();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getAncestors();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getAncestor((((java.lang.Integer)v9).intValue()));
    Object v11 = "publicq";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).children();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "";
    Object v14 = false;
    Object v15 = ((com.google.javascript.jscomp.Scope)v12).isDeclared(((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "removenusedPrototypeProperties";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getOwnSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setWasEmptyNode((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = "publicq";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getVar(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Expeected ";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getOwnSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v8).setIsSyntheticBlock((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = "publicq";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "$";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = -18;
    Object v10 = new com.google.javascript.jscomp.ClosureCodingConvention();
    ((com.google.javascript.rhino.Node)v8).putProp((((java.lang.Integer)v9).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).children();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeFirstChild();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getVars();
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).isEquivalentToTyped(((com.google.javascript.rhino.Node)v10));
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getSlot(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getVar(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ",";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getOwnSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).clonePropsFrom(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getVarCount();
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v8).detachChildren();
    Object v9 = null;
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setVarArgs((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).hasSideEffects();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "arguments";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getOwnSlot(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "4";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getOwnSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ", ";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getVar(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = false;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isQualifiedName();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).clonePropsFrom(((com.google.javascript.rhino.Node)v10));
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.google.javascript.rhino.Node)v1).getAncestor((((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getVars();
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = 42;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = 0;
    ((com.google.javascript.rhino.Node)v8).setLineno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = "publicq";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v3).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v3));
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v8).addChildrenToFront(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v9));
    Object v10 = null;
    Object v11 = "publicq";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toStringTree();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "6";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getOwnSlot(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).isEquivalentTo(((com.google.javascript.rhino.Node)v10));
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.Scope)v15).getVarCount();
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).siblings();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = false;
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.Node)v8).toString((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "publicq";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "";
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.Scope)v16).isDeclared(((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v16));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).removeProp((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "!";
    Object v15 = true;
    Object v16 = ((com.google.javascript.jscomp.Scope)v13).isDeclared(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).isEquivalentToTyped(((com.google.javascript.rhino.Node)v10));
    Object v12 = "publicq";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v15));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v8).addChildrenToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).siblings();
    Object v3 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getQualifiedName();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -24;
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = "publicq";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "publicq";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "publicq";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).copyInformationFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = "publicq";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "publicq";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "j";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getOwnSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "eval";
    Object v2 = new java.io.PrintStream(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v0),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "publicq";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "publicq";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.CodingConvention)v5).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
