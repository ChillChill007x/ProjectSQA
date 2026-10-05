package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v5).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getLength();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    ((com.google.javascript.rhino.Node)v8).setChangeTime((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isFromExterns();
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v5).isEquivalentToTyped(((com.google.javascript.rhino.Node)v8));
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 29;
    Object v14 = "L";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v12).clonePropsFrom(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v5).useSourceInfoFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isNoSideEffectsCall();
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.InputId(((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v5).setInputId(((com.google.javascript.rhino.InputId)v7));
    Object v8 = null;
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 2;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getProp((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).setChangeTime((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -59;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = "DEFAULT_CASE";
    ((com.google.javascript.rhino.Node)v11).setString(((java.lang.String)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -59;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = false;
    Object v16 = true;
    Object v17 = true;
    Object v18 = ((com.google.javascript.rhino.Node)v14).toString((((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 29;
    Object v20 = "L";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).siblings();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v14).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v17));
    Object v19 = 29;
    Object v20 = "L";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).toStringTree();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).children();
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSourceFileName();
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -59;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).wasEmptyNode();
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getInputId();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).srcref(((com.google.javascript.rhino.Node)v9));
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -59;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v11).setQuotedString();
    Object v12 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 0;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getProp((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -59;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneNode();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = new java.io.StringWriter((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v11).appendStringTree(((java.lang.Appendable)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getDirectives();
    Object v16 = 29;
    Object v17 = "L";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 29;
    Object v19 = "L";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v17).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = -15;
    ((com.google.javascript.rhino.Node)v8).setCharno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isLocalResultCall();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v14).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v17));
    Object v19 = 29;
    Object v20 = "L";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v5).isEquivalentToTyped(((com.google.javascript.rhino.Node)v8));
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isSyntheticBlock();
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.Node)v6).removeProp((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = "";
    ((com.google.javascript.rhino.Node)v6).addSuppression(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getSourceFileName();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).srcref(((com.google.javascript.rhino.Node)v9));
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).toString();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = -1;
    ((com.google.javascript.rhino.Node)v9).setType((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).removeProp((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 41;
    Object v8 = 5;
    ((com.google.javascript.rhino.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v6).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 29;
    Object v15 = "L";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).copyInformationFromForTree(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Q";
    Object v2 = -17;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = "&";
    ((com.google.javascript.rhino.Node)v6).setSourceFileForTesting(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getProp((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Q";
    Object v2 = -17;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getSideEffectFlags();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Q";
    Object v2 = -17;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = "RUN_PASSES_NOT_RUN_IN_PREV_ITER";
    ((com.google.javascript.rhino.Node)v8).addSuppression(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getString();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).wasEmptyNode();
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).clonePropsFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getStaticSourceFile();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).toStringTree();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -59;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).srcrefTree(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = "e";
    ((com.google.javascript.rhino.Node)v8).addSuppression(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 29;
    Object v12 = "L";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSourceOffset();
    Object v8 = 29;
    Object v9 = "L";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 29;
    Object v19 = "L";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    ((com.google.javascript.rhino.Node)v17).addChildrenToBack(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = 29;
    Object v9 = "L";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 29;
    Object v4 = "L";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getAncestors();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 29;
    Object v2 = "L";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "?";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 29;
    Object v13 = "L";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 29;
    Object v16 = "L";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 29;
    Object v19 = "L";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    ((com.google.javascript.rhino.Node)v17).addChildToFront(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 29;
    Object v8 = "L";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 29;
    Object v5 = "L";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getDirectives();
    Object v8 = 29;
    Object v9 = "L";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 19;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getProp((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v11).setLineno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getJSDocInfo();
    Object v10 = 29;
    Object v11 = "L";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 29;
    Object v14 = "L";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Q";
    Object v2 = -17;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = "L";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 29;
    Object v10 = "L";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getLength();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
