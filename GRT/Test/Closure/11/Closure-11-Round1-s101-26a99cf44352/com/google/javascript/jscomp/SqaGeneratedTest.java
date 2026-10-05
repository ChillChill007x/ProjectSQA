package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getArgumentsVar();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeCheck)v0).getTypedPercent();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v12));
    Object v14 = false;
    Object v15 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.type.FlowScope)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.TypeCheck)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getAllSymbols();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.type.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v24 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v25 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.jscomp.Scope)v20),((com.google.javascript.jscomp.ScopeCreator)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.CheckLevel)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.CheckLevel)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarCount();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = true;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).setResolveMode(((com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.CheckLevel)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.CheckLevel)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).setResolveMode(((com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.CheckLevel)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(((java.io.Reader)v3));
    ((com.google.javascript.rhino.Node)v2).setDirectives(((java.util.Set)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.CheckLevel)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v11));
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.type.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.jscomp.CheckLevel)v17),((com.google.javascript.jscomp.CheckLevel)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v4),((com.google.javascript.jscomp.ScopeCreator)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).getSourceOffset();
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v8).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isNoSideEffectsCall();
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).isEquivalentToTyped(((com.google.javascript.rhino.Node)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).removeFirstChild();
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).checkTreeEquals(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.jscomp.TypeCheck)v8).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.CheckLevel)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()));
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v31).checkTreeEquals(((com.google.javascript.rhino.Node)v33));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v15).traverse(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v22).copyInformationFrom(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setWasEmptyNode((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v15).traverseRoots(((com.google.javascript.rhino.Node[])v16));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v24).getEnclosingFunction();
    Object v26 = 1;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()));
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v29));
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v17).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 4;
    ((com.google.javascript.rhino.Node)v19).removeProp((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v17).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.CheckLevel)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()));
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v31).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v33));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v12).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = "U";
    Object v19 = new com.google.javascript.rhino.InputId(((java.lang.String)v18));
    ((com.google.javascript.rhino.Node)v17).setInputId(((com.google.javascript.rhino.InputId)v19));
    Object v20 = null;
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    ((com.google.javascript.rhino.Node)v22).setIsSyntheticBlock((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v17).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v17).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.type.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "arg6uments";
    Object v18 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).getType(((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler();
    Object v24 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v26 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v27 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.ScopeCreator)v24),((com.google.javascript.jscomp.CheckLevel)v25),((com.google.javascript.jscomp.CheckLevel)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v17).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v17).processForTesting(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    ((com.google.javascript.rhino.Node)v19).setOptionalArg((((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    Object v22 = false;
    ((com.google.javascript.jscomp.TypeCheck)v17).check(((com.google.javascript.rhino.Node)v19),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v17).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v11));
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.type.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v25 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.jscomp.Scope)v20),((com.google.javascript.jscomp.ScopeCreator)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.CheckLevel)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v17).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = "4";
    Object v19 = "w";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{"",","};
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal)v15).makeError(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = "";
    ((com.google.javascript.rhino.Node)v26).addSuppression(((java.lang.String)v27));
    Object v28 = null;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v17).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.CheckLevel)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = false;
    ((com.google.javascript.rhino.Node)v21).putBooleanProp((((java.lang.Integer)v22).intValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v17).processForTesting(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v15).traverse(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).children();
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneTree();
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    ((com.google.javascript.jscomp.TypeCheck)v17).check(((com.google.javascript.rhino.Node)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getEnclosingFunction();
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v20).isEquivalentTo(((com.google.javascript.rhino.Node)v22));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v17).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()));
    Object v32 = false;
    ((com.google.javascript.jscomp.TypeCheck)v17).check(((com.google.javascript.rhino.Node)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v17).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()));
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()));
    Object v34 = false;
    ((com.google.javascript.rhino.Node)v33).setVarArgs((((java.lang.Boolean)v34).booleanValue()));
    Object v35 = null;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v17).processForTesting(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    ((com.google.javascript.rhino.Node)v19).setOptionalArg((((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSourceFileName();
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getSourceOffset();
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    ((com.google.javascript.jscomp.TypeCheck)v17).check(((com.google.javascript.rhino.Node)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).isUnscopedQualifiedName();
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = ((com.google.javascript.rhino.Node)v19).getIntProp((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    Object v27 = "4";
    Object v28 = "w";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v24).makeError(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()));
    Object v34 = 1;
    Object v35 = new com.google.javascript.rhino.Node((((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v17).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = "0";
    ((com.google.javascript.rhino.Node)v10).addSuppression(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v17).addChildToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).children();
    Object v23 = true;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v7).setLastGeneration((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = ":";
    ((com.google.javascript.rhino.Node)v21).addSuppression(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v19).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v23 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler();
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v28).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v30));
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v26),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v23 = new com.google.javascript.jscomp.CheckUnreachableCode(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler();
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()));
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v26),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v21).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v23));
    Object v25 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = "O";
    Object v23 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v22));
    ((com.google.javascript.rhino.Node)v21).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v23));
    Object v24 = null;
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v19).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getArgumentsVar();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v17).reportMissingProperties((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v19).processForTesting(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
