package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "(";
    Object v2 = 2;
    Object v3 = -36;
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "(";
    Object v6 = 2;
    Object v7 = -36;
    Object v8 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "(";
    Object v2 = 2;
    Object v3 = -36;
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "(";
    Object v6 = 2;
    Object v7 = -36;
    Object v8 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildToBack(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = "(";
    Object v11 = 2;
    Object v12 = -36;
    Object v13 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v2),((com.google.javascript.jscomp.ScopeCreator)v4));
    Object v6 = "(";
    Object v7 = 2;
    Object v8 = -36;
    Object v9 = com.google.javascript.rhino.Node.newString(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "(";
    Object v11 = 2;
    Object v12 = -36;
    Object v13 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v2),((com.google.javascript.jscomp.ScopeCreator)v4));
    Object v6 = "(";
    Object v7 = 2;
    Object v8 = -36;
    Object v9 = com.google.javascript.rhino.Node.newString(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "(";
    Object v11 = 2;
    Object v12 = -36;
    Object v13 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).toStringTree();
    ((com.google.javascript.jscomp.TypeCheck)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "(";
    Object v8 = 2;
    Object v9 = -36;
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v12),((com.google.javascript.jscomp.ScopeCreator)v14),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v2),((com.google.javascript.jscomp.ScopeCreator)v4));
    Object v6 = "(";
    Object v7 = 2;
    Object v8 = -36;
    Object v9 = com.google.javascript.rhino.Node.newString(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Z";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{""};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = "(";
    Object v16 = 2;
    Object v17 = -36;
    Object v18 = com.google.javascript.rhino.Node.newString(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = "(";
    Object v6 = 2;
    Object v7 = -36;
    Object v8 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "(";
    Object v10 = 2;
    Object v11 = -36;
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = false;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v21 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v19).createParametersWithVarArgs(((com.google.javascript.rhino.jstype.JSType[])v20));
    Object v22 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    ((com.google.javascript.jscomp.TypeCheck)v11).check(((com.google.javascript.rhino.Node)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.rhino.Node)v20).addChildrenToBack(((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = -36;
    Object v31 = "Z";
    Object v32 = "";
    Object v33 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v31),((java.lang.String)v32));
    ((com.google.javascript.rhino.Node)v29).putProp((((java.lang.Integer)v30).intValue()),((java.lang.Object)v33));
    Object v34 = null;
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v11).visitName(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = ((com.google.javascript.jscomp.TypeCheck)v11).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -43;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v20).detachChildren();
    Object v21 = null;
    Object v22 = "(";
    Object v23 = 2;
    Object v24 = -36;
    Object v25 = com.google.javascript.rhino.Node.newString(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    ((com.google.javascript.rhino.Node)v25).setWasEmptyNode((((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v11).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "(";
    Object v8 = 2;
    Object v9 = -36;
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v12));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).resolveTypesInScope(((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = ((java.lang.Enum)v16).getDeclaringClass();
    Object v18 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).visitName(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).hasSideEffects();
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v22 = "Z";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v16).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "(";
    Object v32 = 2;
    Object v33 = -36;
    Object v34 = com.google.javascript.rhino.Node.newString(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v11).visitName(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v20).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v24));
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getAncestor((((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "DE7PS_PARSE_ERROR";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).isForwardDeclaredType(((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).isQualifiedName();
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    ((com.google.javascript.jscomp.TypeCheck)v11).check(((com.google.javascript.rhino.Node)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v15).copyInformationFromForTree(((com.google.javascript.rhino.Node)v19));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "(";
    Object v26 = 2;
    Object v27 = -36;
    Object v28 = com.google.javascript.rhino.Node.newString(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.rhino.Node)v24).addChildrenToFront(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "proktotype";
    ((com.google.javascript.rhino.Node)v24).setString(((java.lang.String)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v11).visitName(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).getAncestors();
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "win";
    ((com.google.javascript.rhino.Node)v15).addSuppression(((java.lang.String)v16));
    Object v17 = null;
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Z";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v3),((java.lang.String[])v4));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.CheckLevel)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "(";
    Object v31 = 2;
    Object v32 = -36;
    Object v33 = com.google.javascript.rhino.Node.newString(((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v26),((com.google.javascript.jscomp.NodeTraversal.Callback)v27),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = "(";
    Object v32 = 2;
    Object v33 = -36;
    Object v34 = com.google.javascript.rhino.Node.newString(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = "(";
    Object v36 = 2;
    Object v37 = -36;
    Object v38 = com.google.javascript.rhino.Node.newString(((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v30),((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.Node)v38));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "}\n";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).isForwardDeclaredType(((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = true;
    Object v26 = true;
    Object v27 = true;
    Object v28 = ((com.google.javascript.rhino.Node)v24).toString((((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "(";
    Object v8 = 2;
    Object v9 = -36;
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v16 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v17 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v12),((com.google.javascript.jscomp.ScopeCreator)v14),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.CheckLevel)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -8;
    Object v22 = 57;
    ((com.google.javascript.rhino.Node)v20).putIntProp((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = "(";
    Object v25 = 2;
    Object v26 = -36;
    Object v27 = com.google.javascript.rhino.Node.newString(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v22 = "Z";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v16).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "(";
    Object v32 = 2;
    Object v33 = -36;
    Object v34 = com.google.javascript.rhino.Node.newString(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getQualifiedName();
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = false;
    ((com.google.javascript.rhino.Node)v20).setOptionalArg((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).clearTemplateTypeName();
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v24).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v22 = "Z";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v16).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v30).getJsDocBuilderForNode();
    Object v32 = "(";
    Object v33 = 2;
    Object v34 = -36;
    Object v35 = com.google.javascript.rhino.Node.newString(((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).getQualifiedName();
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v11).visitName(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "]";
    ((com.google.javascript.rhino.Node)v19).setString(((java.lang.String)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v22 = "Z";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{"xterm-color"};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v16).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "(";
    Object v32 = 2;
    Object v33 = -36;
    Object v34 = com.google.javascript.rhino.Node.newString(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = true;
    Object v36 = false;
    Object v37 = true;
    Object v38 = ((com.google.javascript.rhino.Node)v34).toString((((java.lang.Boolean)v35).booleanValue()),(((java.lang.Boolean)v36).booleanValue()),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.rhino.Node)v17).detachChildren();
    Object v18 = null;
    Object v19 = true;
    ((com.google.javascript.jscomp.TypeCheck)v13).check(((com.google.javascript.rhino.Node)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v17).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v21));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v13).processForTesting(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 1;
    Object v28 = true;
    ((com.google.javascript.rhino.Node)v26).putBooleanProp((((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.TypeCheck)v13).visitName(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    ((com.google.javascript.jscomp.TypeCheck)v13).check(((com.google.javascript.rhino.Node)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.jscomp.TypeCheck)v13).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    ((com.google.javascript.rhino.Node)v26).setWasEmptyNode((((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    Object v29 = ((com.google.javascript.jscomp.TypeCheck)v13).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = true;
    ((com.google.javascript.jscomp.TypeCheck)v11).check(((com.google.javascript.rhino.Node)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v13).processForTesting(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v21).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.TypeCheck)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "(";
    Object v8 = 2;
    Object v9 = -36;
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getVars();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v12),((com.google.javascript.jscomp.ScopeCreator)v15),((com.google.javascript.jscomp.CheckLevel)v16),((com.google.javascript.jscomp.CheckLevel)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = new java.util.ArrayList((((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v17).putProp((((java.lang.Integer)v18).intValue()),((java.lang.Object)v20));
    Object v21 = null;
    Object v22 = "(";
    Object v23 = 2;
    Object v24 = -36;
    Object v25 = com.google.javascript.rhino.Node.newString(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v25).copyInformationFromForTree(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v13).processForTesting(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v13).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v22).checkTreeEquals(((com.google.javascript.rhino.Node)v26));
    Object v28 = "(";
    Object v29 = 2;
    Object v30 = -36;
    Object v31 = com.google.javascript.rhino.Node.newString(((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v13).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "(";
    Object v31 = 2;
    Object v32 = -36;
    Object v33 = com.google.javascript.rhino.Node.newString(((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).cloneNode();
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v13).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = "Z";
    Object v25 = "";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"Type tightener could not find variable with name %s"};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v29 = "(";
    Object v30 = 2;
    Object v31 = -36;
    Object v32 = com.google.javascript.rhino.Node.newString(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = "(";
    Object v34 = 2;
    Object v35 = -36;
    Object v36 = com.google.javascript.rhino.Node.newString(((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v13).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 8;
    Object v19 = new java.io.StringWriter((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v17).appendStringTree(((java.lang.Appendable)v19));
    Object v20 = null;
    Object v21 = true;
    ((com.google.javascript.jscomp.TypeCheck)v13).check(((com.google.javascript.rhino.Node)v17),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v16).getEnclosingFunction();
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "(";
    Object v23 = 2;
    Object v24 = -36;
    Object v25 = com.google.javascript.rhino.Node.newString(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v21).copyInformationFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = "(";
    Object v6 = 2;
    Object v7 = -36;
    Object v8 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "(";
    Object v10 = 2;
    Object v11 = -36;
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v29 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v30 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.ScopeCreator)v27),((com.google.javascript.jscomp.CheckLevel)v28),((com.google.javascript.jscomp.CheckLevel)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v19).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v23));
    ((com.google.javascript.jscomp.TypeCheck)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    ((com.google.javascript.rhino.Node)v20).setLineno((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "(";
    Object v26 = 2;
    Object v27 = -36;
    Object v28 = com.google.javascript.rhino.Node.newString(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.rhino.Node)v24).addChildToFront(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).getAncestors();
    ((com.google.javascript.jscomp.TypeCheck)v11).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "(";
    Object v8 = 2;
    Object v9 = -36;
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
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
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v22 = "Z";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v16).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "(";
    Object v32 = 2;
    Object v33 = -36;
    Object v34 = com.google.javascript.rhino.Node.newString(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v13).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypeCheck)v13).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "(";
    Object v24 = 2;
    Object v25 = -36;
    Object v26 = com.google.javascript.rhino.Node.newString(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v13).visitName(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = false;
    ((com.google.javascript.jscomp.TypeCheck)v13).check(((com.google.javascript.rhino.Node)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = "(";
    Object v27 = 2;
    Object v28 = -36;
    Object v29 = com.google.javascript.rhino.Node.newString(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.rhino.Node)v29).detachChildren();
    Object v30 = null;
    Object v31 = false;
    ((com.google.javascript.jscomp.TypeCheck)v11).check(((com.google.javascript.rhino.Node)v29),(((java.lang.Boolean)v31).booleanValue()));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v15).copyInformationFromForTree(((com.google.javascript.rhino.Node)v19));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v17).checkTreeEquals(((com.google.javascript.rhino.Node)v21));
    Object v23 = true;
    ((com.google.javascript.jscomp.TypeCheck)v13).check(((com.google.javascript.rhino.Node)v17),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getScope();
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "(";
    Object v25 = 2;
    Object v26 = -36;
    Object v27 = com.google.javascript.rhino.Node.newString(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = true;
    Object v29 = true;
    Object v30 = true;
    Object v31 = ((com.google.javascript.rhino.Node)v27).toString((((java.lang.Boolean)v28).booleanValue()),(((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()));
    ((com.google.javascript.jscomp.TypeCheck)v13).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isUnscopedQualifiedName();
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "Z";
    Object v24 = "";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"\n","&",""};
    ((com.google.javascript.jscomp.NodeTraversal)v18).report(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v27 = null;
    Object v28 = "(";
    Object v29 = 2;
    Object v30 = -36;
    Object v31 = com.google.javascript.rhino.Node.newString(((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "(";
    Object v33 = 2;
    Object v34 = -36;
    Object v35 = com.google.javascript.rhino.Node.newString(((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v13).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.rhino.Node)v19).addChildToFront(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = "(";
    Object v13 = 2;
    Object v14 = -36;
    Object v15 = com.google.javascript.rhino.Node.newString(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "(";
    Object v17 = 2;
    Object v18 = -36;
    Object v19 = com.google.javascript.rhino.Node.newString(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildToBack(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).hasSideEffects();
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v11).processForTesting(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = "(";
    Object v18 = 2;
    Object v19 = -36;
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "(";
    Object v22 = 2;
    Object v23 = -36;
    Object v24 = com.google.javascript.rhino.Node.newString(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "P";
    ((com.google.javascript.rhino.Node)v24).setString(((java.lang.String)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v11).visitName(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getEnclosingFunction();
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "(";
    Object v25 = 2;
    Object v26 = -36;
    Object v27 = com.google.javascript.rhino.Node.newString(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.jscomp.TypeCheck)v13).visitName(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getQualifiedName();
    ((com.google.javascript.jscomp.TypeCheck)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getScope();
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "(";
    Object v25 = 2;
    Object v26 = -36;
    Object v27 = com.google.javascript.rhino.Node.newString(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.jscomp.TypeCheck)v13).visitName(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getEnclosingFunction();
    Object v20 = "(";
    Object v21 = 2;
    Object v22 = -36;
    Object v23 = com.google.javascript.rhino.Node.newString(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "(";
    Object v25 = 2;
    Object v26 = -36;
    Object v27 = com.google.javascript.rhino.Node.newString(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v13).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = "(";
    Object v20 = 2;
    Object v21 = -36;
    Object v22 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    Object v24 = false;
    Object v25 = false;
    Object v26 = ((com.google.javascript.rhino.Node)v22).toString((((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = "(";
    Object v28 = 2;
    Object v29 = -36;
    Object v30 = com.google.javascript.rhino.Node.newString(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v13).visitName(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v11).reportMissingProperties((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "(";
    Object v15 = 2;
    Object v16 = -36;
    Object v17 = com.google.javascript.rhino.Node.newString(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "(";
    Object v19 = 2;
    Object v20 = -36;
    Object v21 = com.google.javascript.rhino.Node.newString(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).cloneTree();
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v13).processForTesting(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
