package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = true;
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.isContinueStructure(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = false;
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getStaticSourceFile();
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = "s";
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).toString();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).isVarArgs();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getStaticSourceFile();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isContinueStructure(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -37;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPositionForTree((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = -37;
    ((com.google.javascript.rhino.Node)v4).setSourceEncodedPositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v8 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = com.google.javascript.rhino.IR.trueNode();
    Object v19 = com.google.javascript.rhino.IR.trueNode();
    Object v20 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).toString();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v0),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -37;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPositionForTree((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.trueNode();
    Object v2 = -37;
    ((com.google.javascript.rhino.Node)v1).setSourceEncodedPositionForTree((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v0).useSourceInfoFrom(((com.google.javascript.rhino.Node)v5));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v0),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = -37;
    ((com.google.javascript.rhino.Node)v4).setSourceEncodedPositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = -37;
    ((com.google.javascript.rhino.Node)v5).setSourceEncodedPositionForTree((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    Object v9 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v1),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v13));
    Object v15 = com.google.javascript.rhino.IR.trueNode();
    Object v16 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = "pgrototype";
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = -13;
    ((com.google.javascript.rhino.Node)v1).setSourceEncodedPosition((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).getCfg();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v6));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = com.google.javascript.rhino.IR.trueNode();
    Object v18 = com.google.javascript.rhino.IR.trueNode();
    Object v19 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.rhino.Node)v19).isFromExterns();
    Object v21 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = true;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.ControlFlowAnalysis)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.rhino.IR.trueNode();
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v7));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getQualifiedName();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -37;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPositionForTree((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = -37;
    ((com.google.javascript.rhino.Node)v12).setSourceEncodedPositionForTree((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v15));
    Object v17 = com.google.javascript.rhino.IR.trueNode();
    Object v18 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v2));
    Object v3 = null;
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getProp((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).isOptionalArg();
    Object v6 = com.google.javascript.rhino.IR.trueNode();
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v7));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).setLineno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    Object v14 = -37;
    ((com.google.javascript.rhino.Node)v13).setSourceEncodedPositionForTree((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v13));
    Object v17 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.rhino.IR.trueNode();
    Object v19 = ((com.google.javascript.rhino.Node)v17).clonePropsFrom(((com.google.javascript.rhino.Node)v18));
    Object v20 = com.google.javascript.rhino.IR.trueNode();
    Object v21 = -37;
    ((com.google.javascript.rhino.Node)v20).setSourceEncodedPositionForTree((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.isContinueStructure(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    Object v14 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.rhino.Node)v2).addChildrenToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -37;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPositionForTree((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -37;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPositionForTree((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = com.google.javascript.rhino.IR.trueNode();
    Object v20 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getDirectives();
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.isContinueStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v6));
    ((com.google.javascript.rhino.Node)v7).detachChildren();
    Object v8 = null;
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.rhino.IR.trueNode();
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v6));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"'","L","  "};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = com.google.javascript.rhino.IR.trueNode();
    Object v21 = com.google.javascript.rhino.IR.trueNode();
    Object v22 = ((com.google.javascript.rhino.Node)v21).getQualifiedName();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.rhino.Node)v4).addChildrenToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.trueNode();
    Object v9 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -27;
    Object v2 = 27;
    ((com.google.javascript.rhino.Node)v0).putIntProp((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ")";
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v0),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = 9;
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.rhino.Node)v3).putProp((((java.lang.Integer)v4).intValue()),((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = -37;
    ((com.google.javascript.rhino.Node)v4).setSourceEncodedPositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v8 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.trueNode();
    Object v11 = -37;
    ((com.google.javascript.rhino.Node)v10).setSourceEncodedPositionForTree((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v10));
    Object v14 = com.google.javascript.rhino.IR.trueNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).getSideEffectFlags();
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = ((com.google.javascript.rhino.Node)v12).isUnscopedQualifiedName();
    Object v14 = com.google.javascript.rhino.IR.trueNode();
    Object v15 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v15));
    Object v17 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v16).appendStringTree(((java.lang.Appendable)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    Object v14 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v13));
    Object v15 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).isSyntheticBlock();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = true;
    ((com.google.javascript.rhino.Node)v3).setWasEmptyNode((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v3),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isFromExterns();
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v2),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = "[";
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"%","pmrototype","n"};
    ((com.google.javascript.jscomp.NodeTraversal)v11).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = com.google.javascript.rhino.IR.trueNode();
    Object v19 = com.google.javascript.rhino.IR.trueNode();
    Object v20 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v20));
    Object v22 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v3 = com.google.javascript.rhino.IR.trueNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getSideEffectFlags();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v3));
    Object v6 = ((com.google.javascript.rhino.Node)v2).srcref(((com.google.javascript.rhino.Node)v5));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v2),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = true;
    ((com.google.javascript.rhino.Node)v0).setWasEmptyNode((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSideEffectFlags();
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.rhino.IR.trueNode();
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v7));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.trueNode();
    Object v11 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    Object v14 = -37;
    ((com.google.javascript.rhino.Node)v13).setSourceEncodedPositionForTree((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v13));
    Object v17 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isOptionalArg();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.rhino.IR.trueNode();
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setWasEmptyNode((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v13));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = -19;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getIntProp((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.IR.trueNode();
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setWasEmptyNode((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v7));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isOnlyModifiesThisCall();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = 1;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPosition((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSideEffectFlags();
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.rhino.IR.trueNode();
    Object v9 = -37;
    ((com.google.javascript.rhino.Node)v8).setSourceEncodedPositionForTree((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = ".proto&ype";
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = -37;
    ((com.google.javascript.rhino.Node)v0).setSourceEncodedPositionForTree((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = 8;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getIntProp((((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.rhino.IR.trueNode();
    Object v15 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v15));
    Object v17 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v13));
    Object v15 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = true;
    ((com.google.javascript.rhino.Node)v0).setWasEmptyNode((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = com.google.javascript.rhino.IR.trueNode();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = true;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = com.google.javascript.rhino.IR.trueNode();
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new java.lang.String[]{"]"};
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v14).makeError(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.DiagnosticType)v19),((java.lang.String[])v20));
    Object v22 = com.google.javascript.rhino.IR.trueNode();
    Object v23 = com.google.javascript.rhino.IR.trueNode();
    Object v24 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.trueNode();
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setWasEmptyNode((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v4));
    Object v8 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.trueNode();
    Object v10 = -37;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPositionForTree((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v9));
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v19),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = com.google.javascript.rhino.IR.trueNode();
    Object v24 = -37;
    ((com.google.javascript.rhino.Node)v23).setSourceEncodedPositionForTree((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    Object v26 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v23));
    Object v27 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v26));
    Object v28 = com.google.javascript.rhino.IR.trueNode();
    Object v29 = ((com.google.javascript.rhino.Node)v28).getDirectives();
    ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v28));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = com.google.javascript.rhino.IR.trueNode();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v0).clonePropsFrom(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = true;
    ((com.google.javascript.rhino.Node)v0).setWasEmptyNode((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v4 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ControlFlowAnalysis(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = com.google.javascript.rhino.IR.trueNode();
    Object v13 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.rhino.IR.trueNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).getSideEffectFlags();
    Object v16 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v14));
    Object v17 = ((com.google.javascript.jscomp.ControlFlowAnalysis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.trueNode();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v0));
    Object v3 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(((com.google.javascript.rhino.Node)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
