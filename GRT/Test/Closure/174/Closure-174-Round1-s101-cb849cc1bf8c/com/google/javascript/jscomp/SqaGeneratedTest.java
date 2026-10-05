package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getInputId();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    ((com.google.javascript.jscomp.JsAst)v6).clearAst();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    ((com.google.javascript.jscomp.JsAst)v6).clearAst();
    Object v7 = null;
    Object v8 = new java.io.ByteArrayOutputStream();
    Object v9 = new java.io.PrintStream(((java.io.OutputStream)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    ((com.google.javascript.jscomp.JsAst)v6).clearAst();
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.JsAst)v6).getInputId();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    ((com.google.javascript.jscomp.JsAst)v6).clearAst();
    Object v7 = null;
    ((com.google.javascript.jscomp.JsAst)v6).clearAst();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    ((com.google.javascript.jscomp.JsAst)v8).clearAst();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getInputId();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v17 = 0;
    Object v18 = ((com.google.javascript.jscomp.SourceFile)v16).getLineOfOffset((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    ((com.google.javascript.jscomp.JsAst)v8).clearAst();
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getTopScope();
    Object v11 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.JsAst)v17).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = "%";
    Object v19 = new byte[]{};
    Object v20 = 3;
    Object v21 = 1;
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v18),((java.io.InputStream)v22));
    Object v24 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v23));
    Object v25 = ((com.google.javascript.jscomp.JsAst)v24).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v17).setSourceFile(((com.google.javascript.jscomp.SourceFile)v25));
    Object v26 = null;
    Object v27 = new java.io.ByteArrayOutputStream();
    Object v28 = new java.io.PrintStream(((java.io.OutputStream)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = ((com.google.javascript.jscomp.JsAst)v17).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    ((com.google.javascript.jscomp.JsAst)v8).clearAst();
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getTopScope();
    Object v14 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v18));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.JsAst)v8).getInputId();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = "%";
    Object v19 = new byte[]{};
    Object v20 = 3;
    Object v21 = 1;
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v18),((java.io.InputStream)v22));
    Object v24 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v23));
    Object v25 = ((com.google.javascript.jscomp.JsAst)v24).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v17).setSourceFile(((com.google.javascript.jscomp.SourceFile)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    ((com.google.javascript.jscomp.JsAst)v17).clearAst();
    Object v18 = null;
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v17).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getTopScope();
    Object v13 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getInputId();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    ((com.google.javascript.jscomp.JsAst)v10).clearAst();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    ((com.google.javascript.jscomp.JsAst)v8).clearAst();
    Object v9 = null;
    Object v10 = "%";
    Object v11 = new byte[]{};
    Object v12 = 3;
    Object v13 = 1;
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v10),((java.io.InputStream)v14));
    Object v16 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v15));
    Object v17 = ((com.google.javascript.jscomp.JsAst)v16).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = "%";
    Object v17 = new byte[]{};
    Object v18 = 3;
    Object v19 = 1;
    Object v20 = new java.io.ByteArrayInputStream(((byte[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v16),((java.io.InputStream)v20));
    Object v22 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v21));
    Object v23 = ((com.google.javascript.jscomp.JsAst)v22).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v15).setSourceFile(((com.google.javascript.jscomp.SourceFile)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v26 = ".";
    ((com.google.javascript.jscomp.SourceFile)v25).setOriginalPath(((java.lang.String)v26));
    Object v27 = null;
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v25));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = "%";
    Object v19 = new byte[]{};
    Object v20 = 3;
    Object v21 = 1;
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v18),((java.io.InputStream)v22));
    Object v24 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v23));
    Object v25 = ((com.google.javascript.jscomp.JsAst)v24).getSourceFile();
    Object v26 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v25));
    Object v27 = ((com.google.javascript.jscomp.JsAst)v26).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v17).setSourceFile(((com.google.javascript.jscomp.SourceFile)v27));
    Object v28 = null;
    Object v29 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = "%";
    Object v17 = new byte[]{};
    Object v18 = 3;
    Object v19 = 1;
    Object v20 = new java.io.ByteArrayInputStream(((byte[])v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v16),((java.io.InputStream)v20));
    Object v22 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v21));
    Object v23 = ((com.google.javascript.jscomp.JsAst)v22).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v15).setSourceFile(((com.google.javascript.jscomp.SourceFile)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v26 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v25));
    Object v27 = "%";
    Object v28 = new byte[]{};
    Object v29 = 3;
    Object v30 = 1;
    Object v31 = new java.io.ByteArrayInputStream(((byte[])v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v27),((java.io.InputStream)v31));
    Object v33 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v32));
    Object v34 = ((com.google.javascript.jscomp.JsAst)v33).getSourceFile();
    Object v35 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v34));
    Object v36 = ((com.google.javascript.jscomp.JsAst)v35).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v26).setSourceFile(((com.google.javascript.jscomp.SourceFile)v36));
    Object v37 = null;
    Object v38 = ((com.google.javascript.jscomp.JsAst)v26).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = ((com.google.javascript.jscomp.JsAst)v17).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = "%";
    Object v19 = new byte[]{};
    Object v20 = 3;
    Object v21 = 1;
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v18),((java.io.InputStream)v22));
    Object v24 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v23));
    Object v25 = ((com.google.javascript.jscomp.JsAst)v24).getSourceFile();
    Object v26 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v25));
    Object v27 = ((com.google.javascript.jscomp.JsAst)v26).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v17).setSourceFile(((com.google.javascript.jscomp.SourceFile)v27));
    Object v28 = null;
    Object v29 = new java.io.ByteArrayOutputStream();
    Object v30 = new java.io.PrintStream(((java.io.OutputStream)v29));
    Object v31 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v30));
    Object v32 = ((com.google.javascript.jscomp.JsAst)v17).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v16));
    Object v17 = null;
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v18));
    Object v19 = null;
    Object v20 = new java.io.ByteArrayOutputStream();
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new java.io.PrintStream(((java.io.OutputStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    ((com.google.javascript.jscomp.JsAst)v12).clearAst();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    ((com.google.javascript.jscomp.JsAst)v8).clearAst();
    Object v9 = null;
    Object v10 = ((com.google.javascript.jscomp.JsAst)v8).getInputId();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getProgress();
    Object v11 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    ((com.google.javascript.jscomp.AbstractCompiler)v15).reportCodeChange();
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v20));
    Object v21 = null;
    Object v22 = new java.io.ByteArrayOutputStream();
    Object v23 = new java.io.PrintStream(((java.io.OutputStream)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    Object v23 = 26;
    Object v24 = ((com.google.javascript.jscomp.SourceFile)v22).getRegion((((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    ((com.google.javascript.jscomp.JsAst)v17).clearAst();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = "%";
    Object v14 = new byte[]{};
    Object v15 = 3;
    Object v16 = 1;
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v13),((java.io.InputStream)v17));
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    Object v23 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v22));
    Object v24 = ((com.google.javascript.jscomp.JsAst)v23).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v12).setSourceFile(((com.google.javascript.jscomp.SourceFile)v24));
    Object v25 = null;
    Object v26 = new java.io.ByteArrayOutputStream();
    Object v27 = new java.io.PrintStream(((java.io.OutputStream)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ",";
    Object v15 = 0;
    Object v16 = ((com.google.javascript.jscomp.SourceExcerptProvider)v13).getSourceLine(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v8).getInputId();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    ((com.google.javascript.jscomp.AbstractCompiler)v13).reportCodeChange();
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    ((com.google.javascript.jscomp.JsAst)v10).clearAst();
    Object v11 = null;
    Object v12 = new java.io.ByteArrayOutputStream();
    Object v13 = new java.io.PrintStream(((java.io.OutputStream)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = "%";
    Object v8 = new byte[]{};
    Object v9 = 3;
    Object v10 = 1;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.io.InputStream)v11));
    Object v13 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v13).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v6).setSourceFile(((com.google.javascript.jscomp.SourceFile)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getInputId();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getProgress();
    Object v17 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = "p";
    Object v15 = -1;
    Object v16 = ((com.google.javascript.jscomp.SourceExcerptProvider)v13).getSourceRegion(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    ((com.google.javascript.jscomp.JsAst)v12).clearAst();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = "%";
    Object v10 = new byte[]{};
    Object v11 = 3;
    Object v12 = 1;
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v9),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v15).getSourceFile();
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v8).setSourceFile(((com.google.javascript.jscomp.SourceFile)v18));
    Object v19 = null;
    Object v20 = new java.io.ByteArrayOutputStream();
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new java.io.PrintStream(((java.io.OutputStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v14).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = new java.io.PrintStream(((java.io.OutputStream)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ", ";
    Object v21 = 0;
    Object v22 = ((com.google.javascript.jscomp.SourceExcerptProvider)v19).getSourceLine(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v19));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = 1;
    Object v22 = ((com.google.javascript.jscomp.SourceFile)v20).getLine((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v24 = ((com.google.javascript.jscomp.JsAst)v23).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v24));
    Object v25 = null;
    Object v26 = new java.io.ByteArrayOutputStream();
    Object v27 = new java.io.PrintStream(((java.io.OutputStream)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new java.io.PrintStream(((java.io.OutputStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getTopScope();
    Object v19 = ((com.google.javascript.jscomp.JsAst)v14).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = "%";
    Object v16 = new byte[]{};
    Object v17 = 3;
    Object v18 = 1;
    Object v19 = new java.io.ByteArrayInputStream(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v15),((java.io.InputStream)v19));
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    Object v23 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v22));
    Object v24 = ((com.google.javascript.jscomp.JsAst)v23).getSourceFile();
    Object v25 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v24));
    Object v26 = ((com.google.javascript.jscomp.JsAst)v25).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v14).setSourceFile(((com.google.javascript.jscomp.SourceFile)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = "%";
    Object v14 = new byte[]{};
    Object v15 = 3;
    Object v16 = 1;
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v13),((java.io.InputStream)v17));
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v12).setSourceFile(((com.google.javascript.jscomp.SourceFile)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v18));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.JsAst)v10).getInputId();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    ((com.google.javascript.jscomp.JsAst)v12).clearAst();
    Object v13 = null;
    Object v14 = new java.io.ByteArrayOutputStream();
    Object v15 = new java.io.PrintStream(((java.io.OutputStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = "%";
    Object v12 = new byte[]{};
    Object v13 = 3;
    Object v14 = 1;
    Object v15 = new java.io.ByteArrayInputStream(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.io.InputStream)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v17).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v10).setSourceFile(((com.google.javascript.jscomp.SourceFile)v18));
    Object v19 = null;
    Object v20 = new java.io.ByteArrayOutputStream();
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = "";
    Object v24 = 0;
    Object v25 = ((com.google.javascript.jscomp.SourceExcerptProvider)v22).getSourceLine(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v22));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = ((com.google.javascript.jscomp.JsAst)v14).getInputId();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = "%";
    Object v14 = new byte[]{};
    Object v15 = 3;
    Object v16 = 1;
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v13),((java.io.InputStream)v17));
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    Object v23 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v22));
    Object v24 = ((com.google.javascript.jscomp.JsAst)v23).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v12).setSourceFile(((com.google.javascript.jscomp.SourceFile)v24));
    Object v25 = null;
    Object v26 = new java.io.ByteArrayOutputStream();
    Object v27 = new java.io.PrintStream(((java.io.OutputStream)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getTopScope();
    Object v30 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new java.io.PrintStream(((java.io.OutputStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getTopScope();
    Object v19 = ((com.google.javascript.jscomp.JsAst)v10).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getInputId();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new java.io.PrintStream(((java.io.OutputStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.JsAst)v14).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v14).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = "%";
    Object v14 = new byte[]{};
    Object v15 = 3;
    Object v16 = 1;
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v13),((java.io.InputStream)v17));
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v12).setSourceFile(((com.google.javascript.jscomp.SourceFile)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = "%";
    Object v14 = new byte[]{};
    Object v15 = 3;
    Object v16 = 1;
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v13),((java.io.InputStream)v17));
    Object v19 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v18));
    Object v20 = ((com.google.javascript.jscomp.JsAst)v19).getSourceFile();
    Object v21 = "t.~=";
    ((com.google.javascript.jscomp.SourceFile)v20).setOriginalPath(((java.lang.String)v21));
    Object v22 = null;
    ((com.google.javascript.jscomp.JsAst)v12).setSourceFile(((com.google.javascript.jscomp.SourceFile)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getTopScope();
    Object v17 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.JsAst)v6).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    ((com.google.javascript.jscomp.JsAst)v14).clearAst();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getProgress();
    Object v17 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = new java.io.PrintStream(((java.io.OutputStream)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    ((com.google.javascript.jscomp.JsAst)v14).clearAst();
    Object v15 = null;
    Object v16 = new java.io.ByteArrayOutputStream();
    Object v17 = new java.io.PrintStream(((java.io.OutputStream)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = ((com.google.javascript.jscomp.JsAst)v14).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = ((com.google.javascript.jscomp.JsAst)v14).getSourceFile();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v11 = ((com.google.javascript.jscomp.JsAst)v10).getSourceFile();
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = "%";
    Object v16 = new byte[]{};
    Object v17 = 3;
    Object v18 = 1;
    Object v19 = new java.io.ByteArrayInputStream(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v15),((java.io.InputStream)v19));
    Object v21 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v20));
    Object v22 = ((com.google.javascript.jscomp.JsAst)v21).getSourceFile();
    Object v23 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v22));
    Object v24 = ((com.google.javascript.jscomp.JsAst)v23).getSourceFile();
    Object v25 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v24));
    Object v26 = ((com.google.javascript.jscomp.JsAst)v25).getSourceFile();
    Object v27 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v26));
    Object v28 = ((com.google.javascript.jscomp.JsAst)v27).getSourceFile();
    Object v29 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v28));
    Object v30 = ((com.google.javascript.jscomp.JsAst)v29).getSourceFile();
    ((com.google.javascript.jscomp.JsAst)v14).setSourceFile(((com.google.javascript.jscomp.SourceFile)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    ((com.google.javascript.jscomp.JsAst)v12).clearAst();
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.JsAst)v12).getSourceFile();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    ((com.google.javascript.jscomp.JsAst)v8).clearAst();
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = ((com.google.javascript.jscomp.JsAst)v8).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "%";
    Object v1 = new byte[]{};
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v4));
    Object v6 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v5));
    Object v7 = ((com.google.javascript.jscomp.JsAst)v6).getSourceFile();
    Object v8 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v7));
    Object v9 = ((com.google.javascript.jscomp.JsAst)v8).getSourceFile();
    Object v10 = 1;
    Object v11 = ((com.google.javascript.jscomp.SourceFile)v9).getLine((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v9));
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getTopScope();
    Object v17 = ((com.google.javascript.jscomp.JsAst)v12).getAstRoot(((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v17);
  }
}
