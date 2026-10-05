package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toString();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = ((com.google.javascript.jscomp.MethodCompilerPass)v5).getActingCallback();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = ((com.google.javascript.jscomp.MethodCompilerPass)v5).getSignatureStore();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "imFort";
    ((com.google.javascript.rhino.Node)v21).setString(((java.lang.String)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getString();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setIsSyntheticBlock((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Comparator.reverseOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    ((com.google.javascript.rhino.Node)v10).setDirectives(((java.util.Set)v12));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).hasSideEffects();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "]";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.rhino.Node)v21).addChildrenToBack(((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v10).setQuotedString();
    Object v11 = null;
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = true;
    Object v18 = false;
    Object v19 = ((com.google.javascript.rhino.Node)v15).toString((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getAncestors();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildAfter(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    Object v22 = 29;
    Object v23 = "]";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).removeFirstChild();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v26));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v15).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -35;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -19;
    ((com.google.javascript.rhino.Node)v15).setLineno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneTree();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v15).setVarArgs((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).children();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    ((com.google.javascript.rhino.Node)v15).setString(((java.lang.String)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 13;
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v10).putBooleanProp((((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -38;
    Object v12 = 19;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildrenToBack(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v15).detachChildren();
    Object v16 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -60;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v15).copyInformationFromForTree(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getQualifiedName();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    ((com.google.javascript.rhino.Node)v10).setString(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 40;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getAncestor((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v15).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v15).setQuotedString();
    Object v16 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isQualifiedName();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    Object v18 = true;
    Object v19 = true;
    Object v20 = ((com.google.javascript.rhino.Node)v16).toString((((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v10).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v15));
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 3;
    Object v12 = 9;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v10).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v15));
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toStringTree();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).siblings();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 56;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildToBack(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).cloneTree();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -40;
    Object v12 = java.nio.charset.Charset.defaultCharset();
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isQualifiedName();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getString();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).copyInformationFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Comparator.reverseOrder();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    ((com.google.javascript.rhino.Node)v15).setDirectives(((java.util.Set)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildAfter(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    Object v22 = 29;
    Object v23 = "]";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).cloneNode();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    Object v17 = true;
    Object v18 = false;
    Object v19 = ((com.google.javascript.rhino.Node)v15).toString((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getJsDocBuilderForNode();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v16).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "\n";
    ((com.google.javascript.rhino.Node)v10).setString(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "defaLlt";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    ((com.google.javascript.rhino.Node)v15).appendStringTree(((java.lang.Appendable)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildrenToFront(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v16).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 2;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).getString();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).children();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setIsSyntheticBlock((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).hasSideEffects();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 49;
    ((com.google.javascript.rhino.Node)v15).setLineno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).siblings();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getJsDocBuilderForNode();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toString();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v16).setQuotedString();
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v15).putIntProp((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toStringTree();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = -66;
    Object v18 = java.util.Comparator.reverseOrder();
    ((com.google.javascript.rhino.Node)v16).putProp((((java.lang.Integer)v17).intValue()),((java.lang.Object)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = true;
    ((com.google.javascript.rhino.Node)v15).putBooleanProp((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).removeFirstChild();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v17).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -22;
    Object v12 = java.nio.charset.Charset.defaultCharset();
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "]";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "  ";
    ((com.google.javascript.rhino.Node)v10).setString(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = java.util.Comparator.reverseOrder();
    Object v13 = new java.util.TreeSet(((java.util.Comparator)v12));
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = 29;
    Object v16 = "]";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 29;
    Object v18 = "]";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v15).checkTreeEquals(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    Object v17 = false;
    Object v18 = true;
    Object v19 = ((com.google.javascript.rhino.Node)v15).toString((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    Object v17 = false;
    Object v18 = false;
    Object v19 = ((com.google.javascript.rhino.Node)v15).toString((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setWasEmptyNode((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "googX.abstractMethod";
    ((com.google.javascript.rhino.Node)v10).setString(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 31;
    ((com.google.javascript.rhino.Node)v10).setType((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "]";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    ((com.google.javascript.rhino.Node)v17).setWasEmptyNode((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).siblings();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 29;
    Object v17 = "]";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 29;
    Object v22 = "]";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildAfter(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toStringTree();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    Object v12 = 29;
    Object v13 = "]";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).children();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).cloneNode();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "defaLlt";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = new com.google.javascript.jscomp.MethodCheck(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = 29;
    Object v7 = "]";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "]";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).removeChildren();
    ((com.google.javascript.jscomp.MethodCompilerPass)v5).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
