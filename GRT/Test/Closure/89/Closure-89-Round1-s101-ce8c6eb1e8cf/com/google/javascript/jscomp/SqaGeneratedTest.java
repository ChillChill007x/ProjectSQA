package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.GlobalNamespace)v10).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.GlobalNamespace)v10).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v10).scanNewNodes(((com.google.javascript.jscomp.Scope)v11),((java.util.Set)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = ((com.google.javascript.jscomp.GlobalNamespace)v7).getNameForest();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = ((com.google.javascript.jscomp.GlobalNamespace)v7).getNameIndex();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    Object v9 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v7).scanNewNodes(((com.google.javascript.jscomp.Scope)v8),((java.util.Set)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = -25;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = -25;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = -25;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = -21;
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = -21;
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = -21;
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = "(";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v10).scanNewNodes(((com.google.javascript.jscomp.Scope)v15),((java.util.Set)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = "(";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v19 = ((com.google.javascript.jscomp.GlobalNamespace)v18).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = "(";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v19 = ((com.google.javascript.jscomp.GlobalNamespace)v18).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v7).scanNewNodes(((com.google.javascript.jscomp.Scope)v12),((java.util.Set)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = -16;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = -16;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = -16;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = -16;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = 0;
    Object v15 = "(";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v13).scanNewNodes(((com.google.javascript.jscomp.Scope)v18),((java.util.Set)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "^";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getOwnSlot(((java.lang.String)v17));
    Object v19 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = "(";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v19 = 0;
    Object v20 = "(";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v18).scanNewNodes(((com.google.javascript.jscomp.Scope)v23),((java.util.Set)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.GlobalNamespace)v10).getNameForest();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "[;";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "[;";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.GlobalNamespace)v10).getNameForest();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.GlobalNamespace)v8).getNameForest();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "[;";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.GlobalNamespace)v10).getNameIndex();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.GlobalNamespace)v10).getNameIndex();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v9 = ((com.google.javascript.jscomp.GlobalNamespace)v8).getNameIndex();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "Number node not created with Node.newNumber";
    ((com.google.javascript.rhino.Node)v7).setString(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "Number node not created with Node.newNumber";
    ((com.google.javascript.rhino.Node)v7).setString(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "Number node not created with Node.newNumber";
    ((com.google.javascript.rhino.Node)v7).setString(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isUnscopedQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.GlobalNamespace)v8).getNameIndex();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v9 = ((com.google.javascript.jscomp.GlobalNamespace)v8).getNameForest();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isUnscopedQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isUnscopedQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "[;";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v10).scanNewNodes(((com.google.javascript.jscomp.Scope)v15),((java.util.Set)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v9 = 0;
    Object v10 = "(";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = new java.util.TreeSet();
    Object v15 = "L";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = 0;
    Object v21 = "(";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.GlobalNamespace)v23).getNameForest();
    Object v25 = ((java.util.Set)v14).retainAll(((java.util.Collection)v24));
    ((com.google.javascript.jscomp.GlobalNamespace)v8).scanNewNodes(((com.google.javascript.jscomp.Scope)v13),((java.util.Set)v14));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v10).scanNewNodes(((com.google.javascript.jscomp.Scope)v15),((java.util.Set)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isUnscopedQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "numbr";
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.Scope)v16).isDeclared(((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).hasSideEffects();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).hasSideEffects();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).hasSideEffects();
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v13 = ((com.google.javascript.jscomp.GlobalNamespace)v12).getNameIndex();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 0;
    Object v10 = "(";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v13 = ((com.google.javascript.jscomp.GlobalNamespace)v12).getNameForest();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 0;
    Object v10 = "(";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.GlobalNamespace)v12).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v6).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v6).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v15 = ((com.google.javascript.jscomp.GlobalNamespace)v14).getNameIndex();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v6).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v9 = 0;
    Object v10 = "(";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v8).scanNewNodes(((com.google.javascript.jscomp.Scope)v13),((java.util.Set)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setOptionalArg((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 0;
    Object v10 = "(";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.GlobalNamespace)v12).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = " ";
    Object v5 = -15;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v16 = ((com.google.javascript.jscomp.GlobalNamespace)v15).getNameForest();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v6).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.GlobalNamespace)v14).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = " ";
    Object v5 = -15;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "arg";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getSlot(((java.lang.String)v17));
    Object v19 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.GlobalNamespace)v8).getNameIndex();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v16 = 0;
    Object v17 = "(";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = new java.util.TreeSet();
    Object v22 = new java.lang.Object[]{};
    Object v23 = ((java.util.Set)v21).toArray(((java.lang.Object[])v22));
    ((com.google.javascript.jscomp.GlobalNamespace)v15).scanNewNodes(((com.google.javascript.jscomp.Scope)v20),((java.util.Set)v21));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v6).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    Object v15 = ((com.google.javascript.jscomp.GlobalNamespace)v14).getNameForest();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isUnscopedQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.GlobalNamespace)v8).getNameForest();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.GlobalNamespace)v11).getNameIndex();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = " ";
    Object v5 = -15;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.GlobalNamespace)v13).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "(";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v9).addChildAfter(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = 0;
    Object v6 = "(";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v16 = ((com.google.javascript.jscomp.GlobalNamespace)v15).getNameIndex();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "(";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = "(";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v9).addChildAfter(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v18 = ((com.google.javascript.jscomp.GlobalNamespace)v17).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = "(";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v6).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0;
    Object v12 = "(";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.GlobalNamespace)v14).getNameForest();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isUnscopedQualifiedName();
    Object v8 = 0;
    Object v9 = "(";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "(";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getVarCount();
    Object v18 = new java.util.TreeSet();
    ((com.google.javascript.jscomp.GlobalNamespace)v11).scanNewNodes(((com.google.javascript.jscomp.Scope)v16),((java.util.Set)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).hasSideEffects();
    Object v8 = new com.google.javascript.jscomp.GlobalNamespace(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v8);
  }
}
