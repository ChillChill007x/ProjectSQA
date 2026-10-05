package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 14;
    ((com.google.javascript.rhino.Node)v7).setCharno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneTree();
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getLength();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "";
    ((com.google.javascript.rhino.Node)v5).setSourceFileForTesting(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v11).setType((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).srcref(((com.google.javascript.rhino.Node)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 5;
    Object v10 = -29;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "provider";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJsDocBuilderForNode();
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "provider";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 0;
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
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
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).checkTreeEquals(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "provider";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v11).setSourceEncodedPositionForTree((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneNode();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "]";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "provider";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "fals";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneNode();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJSDocInfo();
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "fals";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).setCharno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.util.TreeSet();
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getStaticSourceFile();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "provider";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0;
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOnlyModifiesThisCall();
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isOnlyModifiesThisCall();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isLocalResultCall();
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = " {";
    ((com.google.javascript.rhino.Node)v8).setSourceFileForTesting(((java.lang.String)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 20;
    ((com.google.javascript.rhino.Node)v6).setLength((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).srcrefTree(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v8).setWasEmptyNode((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isVarArgs();
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toStringTree();
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).wasEmptyNode();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
