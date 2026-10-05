package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).wasEmptyNode();
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).getSourceOffset();
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v8).setVarArgs((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).isVarArgs();
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -2;
    ((com.google.javascript.rhino.Node)v4).setSourceEncodedPositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getInputId();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.rhino.Node)v3).detachChildren();
    Object v4 = null;
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "V";
    ((com.google.javascript.rhino.Node)v6).addSuppression(((java.lang.String)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.rhino.Node)v6).addChildrenToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getQualifiedName();
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getBooleanProp((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).isEquivalentTo(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getLength();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).wasEmptyNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    ((com.google.javascript.rhino.Node)v9).setLineno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSourceFileName();
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v4).appendStringTree(((java.lang.Appendable)v5));
    Object v6 = null;
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v6).appendStringTree(((java.lang.Appendable)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setVarArgs((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v3).clonePropsFrom(((com.google.javascript.rhino.Node)v5));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isLocalResultCall();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getIntProp((((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 66;
    ((com.google.javascript.rhino.Node)v8).setLength((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "' iy the factory list";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "' iy the factory list";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v4).srcrefTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getIntProp((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isOnlyModifiesThisCall();
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = 2;
    Object v10 = 0;
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "prototy6pe";
    Object v13 = "W";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"n","g"};
    Object v16 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "this";
    Object v10 = new java.io.File(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v10));
    ((com.google.javascript.rhino.Node)v8).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).siblings();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getProp((((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 42;
    ((com.google.javascript.rhino.Node)v8).setType((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -16;
    ((com.google.javascript.rhino.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSideEffectFlags();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "D";
    ((com.google.javascript.rhino.Node)v6).setSourceFileForTesting(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getLength();
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = true;
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.Node)v6).toString((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isSyntheticBlock();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getDirectives();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).removeProp((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "super";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).clonePropsFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -47;
    Object v8 = 43;
    ((com.google.javascript.rhino.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "super";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSideEffectFlags();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v4).srcrefTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getInputId();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = false;
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.Node)v8).toString((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toString();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 0;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getBooleanProp((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    ((com.google.javascript.rhino.Node)v8).setSourceFileForTesting(((java.lang.String)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "super";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).wasEmptyNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "j";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.rhino.Node)v6).addChildrenToBack(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).isOnlyModifiesThisCall();
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "j";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getStaticSourceFile();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "j";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getDirectives();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "super";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = -20;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getProp((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    ((com.google.javascript.rhino.Node)v6).addSuppression(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getDirectives();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "_";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v3).putBooleanProp((((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).checkTreeEquals(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "j";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.rhino.Node)v6).addChildrenToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = false;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "super";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.rhino.Node)v6).addChildrenToBack(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prot";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v8).appendStringTree(((java.lang.Appendable)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "j";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.CollapseVariableDeclarations(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CollapseVariableDeclarations)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
