package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).hasSideEffects();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -7;
    ((com.google.javascript.rhino.Node)v4).removeProp((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -5;
    Object v12 = "   ";
    Object v13 = 1;
    Object v14 = -43;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    ((com.google.javascript.rhino.Node)v4).setString(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 25;
    ((com.google.javascript.rhino.Node)v4).setSourcePositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = null;
    Object v3 = true;
    Object v4 = true;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -5;
    Object v12 = "   ";
    Object v13 = 1;
    Object v14 = -43;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v10).isEquivalentToTyped(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 59;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v4).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).siblings();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getQualifiedName();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -58;
    Object v6 = "";
    Object v7 = -5;
    Object v8 = "   ";
    Object v9 = 1;
    Object v10 = -43;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "";
    Object v14 = "A";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{""};
    Object v17 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.rhino.Node)v4).putProp((((java.lang.Integer)v5).intValue()),((java.lang.Object)v17));
    Object v18 = null;
    Object v19 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    ((com.google.javascript.rhino.Node)v10).addSuppression(((java.lang.String)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).trimCanidatesUsingOnCost();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).clonePropsFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneNode();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = -5;
    Object v10 = "   ";
    Object v11 = 1;
    Object v12 = -43;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).removeInlinedFunctions();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = null;
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    ((com.google.javascript.rhino.Node)v4).setDirectives(((java.util.Set)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setLineno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isUnscopedQualifiedName();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJsDocBuilderForNode();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 4;
    ((com.google.javascript.rhino.Node)v4).removeProp((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildrenToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "6";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.SimpleFunctionAliasAnalysis();
    Object v2 = new com.google.javascript.jscomp.SpecializeModule.SpecializationState(((com.google.javascript.jscomp.SimpleFunctionAliasAnalysis)v1));
    ((com.google.javascript.jscomp.InlineFunctions)v0).enableSpecialization(((com.google.javascript.jscomp.SpecializeModule.SpecializationState)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    ((com.google.javascript.rhino.Node)v4).setSourcePositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "constant {0} assigned a v`lue more than once";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isQualifiedName();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).removeFirstChild();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = true;
    Object v4 = true;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = 1;
    ((com.google.javascript.rhino.Node)v4).putIntProp((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = " ->p";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    ((com.google.javascript.rhino.Node)v5).removeProp((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = -5;
    Object v9 = "   ";
    Object v10 = 1;
    Object v11 = -43;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setWasEmptyNode((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.rhino.Node)v4).setQuotedString();
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -1;
    ((com.google.javascript.rhino.Node)v4).removeProp((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setIsSyntheticBlock((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).removeChildren();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getAncestors();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.rhino.Node)v4).detachChildren();
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v4).putIntProp((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "( ";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -12;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    ((com.google.javascript.rhino.Node)v4).removeProp((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = null;
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = null;
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = true;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setVarArgs((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).children();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setOptionalArg((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getAncestor((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setSourcePositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = null;
    Object v3 = false;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = false;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = " should e in the graph.";
    ((com.google.javascript.rhino.Node)v4).setString(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = -5;
    Object v8 = "   ";
    Object v9 = 1;
    Object v10 = -43;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setVarArgs((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = 25;
    ((com.google.javascript.rhino.Node)v4).putIntProp((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).copyInformationFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineFunctions(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).siblings();
    Object v7 = -5;
    Object v8 = "   ";
    Object v9 = 1;
    Object v10 = -43;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setIsSyntheticBlock((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5;
    Object v6 = "   ";
    Object v7 = 1;
    Object v8 = -43;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -5;
    Object v11 = "   ";
    Object v12 = 1;
    Object v13 = -43;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -22;
    Object v6 = 1;
    ((com.google.javascript.rhino.Node)v4).putIntProp((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = -26;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 13;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -5;
    Object v7 = "   ";
    Object v8 = 1;
    Object v9 = -43;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setWasEmptyNode((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -30;
    Object v6 = 1;
    ((com.google.javascript.rhino.Node)v4).putIntProp((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getString();
    Object v6 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 5;
    ((com.google.javascript.rhino.Node)v4).setSourcePositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.SimpleFunctionAliasAnalysis();
    Object v2 = new com.google.javascript.jscomp.SpecializeModule.SpecializationState(((com.google.javascript.jscomp.SimpleFunctionAliasAnalysis)v1));
    Object v3 = -5;
    Object v4 = "   ";
    Object v5 = 1;
    Object v6 = -43;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.jscomp.SpecializeModule.SpecializationState)v2).canFixupSpecializedFunctionContainingNode(((com.google.javascript.rhino.Node)v7));
    ((com.google.javascript.jscomp.InlineFunctions)v0).enableSpecialization(((com.google.javascript.jscomp.SpecializeModule.SpecializationState)v2));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -5;
    Object v2 = "   ";
    Object v3 = 1;
    Object v4 = -43;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setSourcePositionForTree((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = -5;
    Object v9 = "   ";
    Object v10 = 1;
    Object v11 = -43;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v12).setIsSyntheticBlock((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineFunctions)v0).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "   ";
    Object v2 = 1;
    Object v3 = -43;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v4).setOptionalArg((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
