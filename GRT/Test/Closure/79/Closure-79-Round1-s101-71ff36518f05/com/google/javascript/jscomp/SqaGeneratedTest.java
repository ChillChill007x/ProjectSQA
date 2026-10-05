package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v3).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v6));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.VarCheck)v0).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "(";
    Object v5 = -57;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = 0;
    Object v34 = "";
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = "strig";
    Object v26 = "";
    Object v27 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new java.lang.String[]{};
    Object v29 = ((com.google.javascript.jscomp.NodeTraversal)v21).makeError(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.DiagnosticType)v27),((java.lang.String[])v28));
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = 0;
    Object v34 = "";
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = ((com.google.javascript.rhino.Node)v24).getAncestor((((java.lang.Integer)v25).intValue()));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.jscomp.NodeTraversal)v22).traverse(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isQualifiedName();
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = true;
    Object v30 = false;
    Object v31 = true;
    Object v32 = ((com.google.javascript.rhino.Node)v28).toString((((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = false;
    ((com.google.javascript.rhino.Node)v28).setIsSyntheticBlock((((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v27 = "strig";
    Object v28 = "";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v22).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 0;
    Object v33 = "";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    Object v35 = 0;
    Object v36 = "";
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v35).intValue()),((java.lang.String)v36));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = "strig";
    Object v27 = "";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v22).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = 0;
    Object v35 = "";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v28).removeChildren();
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "strig";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v4),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v12));
    Object v13 = null;
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = 0;
    Object v33 = "";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setWasEmptyNode((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new java.util.HashSet();
    ((com.google.javascript.rhino.Node)v12).setDirectives(((java.util.Set)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).siblings();
    Object v29 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v25).copyInformationFrom(((com.google.javascript.rhino.Node)v28));
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = "#";
    ((com.google.javascript.rhino.Node)v32).setString(((java.lang.String)v33));
    Object v34 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v32));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setIsSyntheticBlock((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = 0;
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = true;
    ((com.google.javascript.rhino.Node)v25).putBooleanProp((((java.lang.Integer)v26).intValue()),(((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.jscomp.NodeTraversal)v22).traverse(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.rhino.Node)v29).setQuotedString();
    Object v30 = null;
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = false;
    Object v29 = true;
    Object v30 = true;
    Object v31 = ((com.google.javascript.rhino.Node)v27).toString((((java.lang.Boolean)v28).booleanValue()),(((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getAncestors();
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v9).addChildAfter(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 0;
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeChildren();
    Object v11 = 0;
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).getEnclosingFunction();
    Object v24 = 0;
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getString();
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    Object v11 = 0;
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.Node)v24).toStringTree();
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setType((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 0;
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    ((com.google.javascript.rhino.Node)v24).setQuotedString();
    Object v25 = null;
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = "strig";
    Object v27 = "";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"undefi"};
    ((com.google.javascript.jscomp.NodeTraversal)v22).report(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v30 = null;
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = 0;
    Object v35 = "";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getString();
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).getScope();
    Object v24 = 0;
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = "strig";
    Object v27 = "";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v22).report(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v30 = null;
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = 0;
    Object v35 = "";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    Object v37 = true;
    ((com.google.javascript.rhino.Node)v36).setWasEmptyNode((((java.lang.Boolean)v37).booleanValue()));
    Object v38 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.rhino.Node)v25).addChildrenToFront(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = -4;
    ((com.google.javascript.rhino.Node)v32).setType((((java.lang.Integer)v33).intValue()));
    Object v34 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v32));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "(";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = "strig";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{};
    Object v22 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v14),((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    ((com.google.javascript.rhino.Node)v12).putProp((((java.lang.Integer)v13).intValue()),((java.lang.Object)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getAncestors();
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = -35;
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v16).booleanValue()));
    ((com.google.javascript.rhino.Node)v9).putProp((((java.lang.Integer)v10).intValue()),((java.lang.Object)v17));
    Object v18 = null;
    Object v19 = 0;
    Object v20 = "";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v28).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v12).copyInformationFromForTree(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).removeFirstChild();
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.rhino.Node)v29).detachChildren();
    Object v30 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 13;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getAncestor((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).getScope();
    Object v24 = 0;
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isQualifiedName();
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "strig";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v4),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v12));
    Object v13 = null;
    Object v14 = false;
    Object v15 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v25).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v27 = null;
    Object v28 = 0;
    Object v29 = "";
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isQualifiedName();
    Object v11 = 0;
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = "nameAnonymousFuctions";
    ((com.google.javascript.rhino.Node)v9).addSuppression(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = 0;
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).removeFirstChild();
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = -47;
    ((com.google.javascript.rhino.Node)v28).setCharno((((java.lang.Integer)v29).intValue()));
    Object v30 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = 0;
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ".prototype.";
    Object v5 = -41;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = ((com.google.javascript.rhino.Node)v28).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v31));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = ((com.google.javascript.rhino.Node)v25).getAncestor((((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = "";
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 21;
    Object v27 = ((com.google.javascript.rhino.Node)v25).getAncestor((((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = "";
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = ((com.google.javascript.rhino.Node)v30).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v33));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).hasScope();
    Object v24 = 0;
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v25).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v28));
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = 0;
    Object v34 = "";
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34));
    Object v36 = ((com.google.javascript.rhino.Node)v32).copyInformationFrom(((com.google.javascript.rhino.Node)v35));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v32));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = "targetblock";
    ((com.google.javascript.rhino.Node)v9).setString(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = 0;
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = 0;
    Object v34 = "";
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = "strig";
    Object v27 = "";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"goog.getCssName","",""};
    ((com.google.javascript.jscomp.NodeTraversal)v22).report(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v30 = null;
    Object v31 = 0;
    Object v32 = "";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = 0;
    Object v35 = "";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = 0;
    Object v33 = "";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    Object v35 = ((com.google.javascript.rhino.Node)v31).checkTreeEquals(((com.google.javascript.rhino.Node)v34));
    Object v36 = 0;
    Object v37 = "";
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v36).intValue()),((java.lang.String)v37));
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    ((com.google.javascript.rhino.Node)v24).detachChildren();
    Object v25 = null;
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "gooL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    ((com.google.javascript.rhino.Node)v12).appendStringTree(((java.lang.Appendable)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = 1;
    ((com.google.javascript.rhino.Node)v25).putIntProp((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v8).clonePropsFrom(((com.google.javascript.rhino.Node)v11));
    Object v13 = 0;
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = 0;
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = -7;
    ((com.google.javascript.rhino.Node)v13).setType((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).hasScope();
    Object v24 = 0;
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 86;
    ((com.google.javascript.rhino.Node)v9).setLineno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 0;
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    ((com.google.javascript.rhino.Node)v28).addChildrenToFront(((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = 0;
    Object v30 = "";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = 0;
    Object v33 = "";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v34).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v35));
    Object v36 = null;
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v34));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal)v21).hasScope();
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).cloneNode();
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = 0;
    Object v24 = "";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 0;
    Object v27 = "";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v25).copyInformationFrom(((com.google.javascript.rhino.Node)v28));
    Object v30 = 0;
    Object v31 = "";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "gooL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "gooL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "gooL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v15),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 0;
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 0;
    Object v26 = "";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).cloneNode();
    ((com.google.javascript.jscomp.VarCheck)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = 0;
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.VarCheck)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 0;
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 0;
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v11).addChildAfter(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.VarCheck)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "gooL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.VarCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "gooL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "gooL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "gooL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).getEnclosingFunction();
    Object v24 = 0;
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = "";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.VarCheck)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }
}
