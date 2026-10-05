package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeCheck)v0).getTypedPercent();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.CheckLevel)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "2";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getType(((java.lang.String)v7));
    Object v9 = "%";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v12),((com.google.javascript.jscomp.ScopeCreator)v14),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "%";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = false;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "%";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = "%";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v5 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v5),((com.google.javascript.jscomp.ScopeCreator)v7));
    Object v9 = "%";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "%";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = "H";
    Object v12 = "argument";
    Object v13 = -35;
    Object v14 = 1;
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getType(((com.google.javascript.rhino.jstype.StaticScope)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = "%";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.FlowScope)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = "k";
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v15).getType(((java.lang.String)v16));
    Object v18 = "%";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v25 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v26 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.ScopeCreator)v23),((com.google.javascript.jscomp.CheckLevel)v24),((com.google.javascript.jscomp.CheckLevel)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.CheckLevel)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = "%";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.FlowScope)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = "%";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v23 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v24 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((com.google.javascript.jscomp.Scope)v19),((com.google.javascript.jscomp.ScopeCreator)v21),((com.google.javascript.jscomp.CheckLevel)v22),((com.google.javascript.jscomp.CheckLevel)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = "[E";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getSlot(((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.ScopeCreator)v14),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createAnonymousObjectType();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "%";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v2).setIsSyntheticBlock((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "%";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v19).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v19).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v19).processForTesting(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    ((com.google.javascript.rhino.Node)v21).addChildrenToBack(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v7).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v8));
    Object v10 = "%";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.jscomp.ScopeCreator)v15),((com.google.javascript.jscomp.CheckLevel)v16),((com.google.javascript.jscomp.CheckLevel)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = 28;
    ((com.google.javascript.rhino.Node)v21).setSourcePositionForTree((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = "%";
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v19).processForTesting(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = ((com.google.javascript.rhino.Node)v23).isQualifiedName();
    ((com.google.javascript.jscomp.TypeCheck)v19).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).getQualifiedName();
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "%";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    ((com.google.javascript.rhino.Node)v20).addChildrenToBack(((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = true;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v27).getEnclosingFunction();
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    ((com.google.javascript.jscomp.TypeCheck)v19).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = 0;
    ((com.google.javascript.rhino.Node)v21).setCharno((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = true;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = true;
    ((com.google.javascript.rhino.Node)v29).setOptionalArg((((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    Object v32 = "%";
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v32));
    Object v34 = "%";
    Object v35 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.rhino.Node)v33).isEquivalentToTyped(((com.google.javascript.rhino.Node)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = false;
    ((com.google.javascript.jscomp.TypeCheck)v16).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).toString();
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    ((com.google.javascript.jscomp.TypeCheck)v19).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v16).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v21).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v23 = null;
    Object v24 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = "%";
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v23).copyInformationFrom(((com.google.javascript.rhino.Node)v25));
    ((com.google.javascript.jscomp.TypeCheck)v19).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v20).hasSideEffects();
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    ((com.google.javascript.rhino.Node)v26).addChildToBack(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v26).checkTreeEquals(((com.google.javascript.rhino.Node)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v24).getEnclosingFunction();
    Object v26 = "%";
    Object v27 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.rhino.Node)v29).clonePropsFrom(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getQualifiedName();
    Object v23 = "%";
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23));
    ((com.google.javascript.jscomp.TypeCheck)v19).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = 44;
    Object v23 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v21).putProp((((java.lang.Integer)v22).intValue()),((java.lang.Object)v23));
    Object v24 = null;
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v19).processForTesting(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = true;
    ((com.google.javascript.jscomp.TypeCheck)v16).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = 25;
    ((com.google.javascript.rhino.Node)v18).setLineno((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = "%";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = 92;
    ((com.google.javascript.rhino.Node)v18).setCharno((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = false;
    ((com.google.javascript.jscomp.TypeCheck)v16).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = false;
    ((com.google.javascript.rhino.Node)v28).setWasEmptyNode((((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
    ((com.google.javascript.jscomp.TypeCheck)v16).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = 16;
    Object v20 = 32;
    ((com.google.javascript.rhino.Node)v18).putIntProp((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v28 = "arguments";
    Object v29 = "c";
    Object v30 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new java.lang.String[]{"case "};
    Object v32 = ((com.google.javascript.jscomp.NodeTraversal)v24).makeError(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.CheckLevel)v27),((com.google.javascript.jscomp.DiagnosticType)v30),((java.lang.String[])v31));
    Object v33 = "%";
    Object v34 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v33));
    Object v35 = "%";
    Object v36 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.Node)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v28 = "arguments";
    Object v29 = "c";
    Object v30 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new java.lang.String[]{"","",""};
    Object v32 = ((com.google.javascript.jscomp.NodeTraversal)v24).makeError(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.CheckLevel)v27),((com.google.javascript.jscomp.DiagnosticType)v30),((java.lang.String[])v31));
    Object v33 = "%";
    Object v34 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v33));
    Object v35 = "%";
    Object v36 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v27).getEnclosingFunction();
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v19).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "Q";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).hasNamespace(((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "";
    ((com.google.javascript.rhino.Node)v21).addSuppression(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    ((com.google.javascript.rhino.Node)v26).addChildToBack(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "arguments";
    Object v28 = "c";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v24).makeError(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = "%";
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v32));
    Object v34 = "%";
    Object v35 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v34));
    ((com.google.javascript.jscomp.TypeCheck)v16).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    ((com.google.javascript.jscomp.TypeCheck)v19).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = 28;
    Object v22 = ((com.google.javascript.rhino.Node)v20).getAncestor((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = true;
    Object v28 = false;
    Object v29 = false;
    Object v30 = ((com.google.javascript.rhino.Node)v26).toString((((java.lang.Boolean)v27).booleanValue()),(((java.lang.Boolean)v28).booleanValue()),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "nul";
    Object v22 = 60;
    Object v23 = 1;
    Object v24 = "arguments";
    Object v25 = "c";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"arguments","D"};
    Object v28 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v29 = "arguments";
    Object v30 = "c";
    Object v31 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = java.util.Set.of(((java.lang.Object)v28),((java.lang.Object)v31),((java.lang.Object)v32));
    ((com.google.javascript.rhino.Node)v20).setDirectives(((java.util.Set)v33));
    Object v34 = null;
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    ((com.google.javascript.jscomp.TypeCheck)v16).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v28).hasSideEffects();
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v27).hasScope();
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    ((com.google.javascript.jscomp.TypeCheck)v19).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).getJsDocBuilderForNode();
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v19).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v18).toStringTree();
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = ((com.google.javascript.rhino.Node)v21).copyInformationFrom(((com.google.javascript.rhino.Node)v23));
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).children();
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    ((com.google.javascript.jscomp.TypeCheck)v16).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v27).getScope();
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v19).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v20).removeFirstChild();
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = 1;
    ((com.google.javascript.rhino.Node)v29).removeProp((((java.lang.Integer)v30).intValue()));
    Object v31 = null;
    Object v32 = "%";
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v32));
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v19).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
    org.junit.Assert.assertEquals((Object)(false), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.rhino.Node)v31).toStringTree();
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v19).visitName(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v27).getScope();
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    ((com.google.javascript.jscomp.TypeCheck)v19).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "%";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    ((com.google.javascript.rhino.Node)v20).addChildrenToFront(((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    ((com.google.javascript.rhino.Node)v28).addChildToBack(((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "arguments";
    Object v28 = "c";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v24).makeError(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = "%";
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v32));
    Object v34 = "%";
    Object v35 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.rhino.Node)v31).getJsDocBuilderForNode();
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "arguments";
    Object v28 = "c";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"prot~otype","E"};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v24).makeError(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = "%";
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v32));
    Object v34 = "%";
    Object v35 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.Node)v21).isUnscopedQualifiedName();
    Object v23 = "%";
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v19).processForTesting(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = "arguments";
    Object v31 = "c";
    Object v32 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = new java.lang.String[]{"/** Begin line maps. **/","Unknon precedence for "};
    Object v34 = ((com.google.javascript.jscomp.NodeTraversal)v27).makeError(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.DiagnosticType)v32),((java.lang.String[])v33));
    Object v35 = "%";
    Object v36 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v35));
    Object v37 = "%";
    Object v38 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v37));
    ((com.google.javascript.jscomp.TypeCheck)v19).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v27).getEnclosingFunction();
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = "%";
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = "%";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = 25;
    ((com.google.javascript.rhino.Node)v21).setLineno((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = false;
    ((com.google.javascript.jscomp.TypeCheck)v19).check(((com.google.javascript.rhino.Node)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).toStringTree();
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isUnscopedQualifiedName();
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = true;
    Object v31 = true;
    Object v32 = true;
    Object v33 = ((com.google.javascript.rhino.Node)v29).toString((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = "%";
    Object v35 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v19).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = true;
    ((com.google.javascript.rhino.Node)v18).setVarArgs((((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
    Object v21 = "%";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = "%";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.FlowScope)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v24).hasScope();
    Object v26 = "%";
    Object v27 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26));
    Object v28 = 0;
    ((com.google.javascript.rhino.Node)v27).setCharno((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = "%";
    Object v31 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v16).visitName(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "%";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.FlowScope)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v16).forwardDeclareType(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v24 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CheckLevel)v22),((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = 0;
    Object v31 = 8;
    ((com.google.javascript.rhino.Node)v29).putIntProp((((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v32 = null;
    Object v33 = "%";
    Object v34 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v33));
    ((com.google.javascript.jscomp.TypeCheck)v19).visit(((com.google.javascript.jscomp.NodeTraversal)v27),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).cloneTree();
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = "%";
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27));
    Object v29 = "%";
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.rhino.Node)v28).isEquivalentToTyped(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v24).hasScope();
    Object v26 = "%";
    Object v27 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26));
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v16).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "%";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = "";
    Object v12 = "Graph initialized with edge annotations turned off";
    Object v13 = -31;
    Object v14 = 1;
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getType(((com.google.javascript.rhino.jstype.StaticScope)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = "mismatch of the {0} property type and the typ]e of the property it overrides from superclass {1}\noriginal: {2}\noverride: {3}";
    Object v21 = new com.google.javascript.jscomp.CheckMissingGetCssName(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19),((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v21),((com.google.javascript.jscomp.ScopeCreator)v23));
    Object v25 = "%";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).getJsDocBuilderForNode();
    Object v28 = "%";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    ((com.google.javascript.jscomp.TypeCheck)v16).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v18).isEquivalentTo(((com.google.javascript.rhino.Node)v20));
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v16).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "%";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = -20;
    ((com.google.javascript.rhino.Node)v20).putIntProp((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "%";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.ScopeCreator)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.CheckLevel)v15));
    Object v17 = "%";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = 0;
    Object v20 = -50;
    ((com.google.javascript.rhino.Node)v18).putIntProp((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = "%";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    ((com.google.javascript.jscomp.TypeCheck)v16).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
