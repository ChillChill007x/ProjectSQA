package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJSDocInfo();
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    Object v12 = 7;
    ((com.google.javascript.rhino.Node)v11).setLineno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = "0";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    ((com.google.javascript.rhino.Node)v4).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).setSourceEncodedPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = -20;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getInputId();
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    Object v13 = -10;
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v12).putIntProp((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = "v";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).clonePropsFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJSDocInfo();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = -9;
    ((com.google.javascript.rhino.Node)v4).removeProp((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isFromExterns();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).isEquivalentToTyped(((com.google.javascript.rhino.Node)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPositionForTree((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.rhino.Node)v7).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    Object v13 = 0;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v14));
    ((com.google.javascript.rhino.Node)v12).putProp((((java.lang.Integer)v13).intValue()),((java.lang.Object)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isOnlyModifiesThisCall();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = "L";
    ((com.google.javascript.rhino.Node)v5).setSourceFileForTesting(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = 0;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.rhino.Node)v4).addChildAfter(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v7).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = -2;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getIntProp((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getBooleanProp((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = -27;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getIntProp((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = "0";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    ((com.google.javascript.rhino.Node)v4).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = 0;
    Object v7 = 15;
    ((com.google.javascript.rhino.Node)v5).putIntProp((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeFirstChild();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = -22;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getProp((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getDirectives();
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getSourceOffset();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).copyInformationFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v11).clonePropsFrom(((com.google.javascript.rhino.Node)v13));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = 43;
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = 1;
    ((com.google.javascript.rhino.Node)v5).setType((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.rhino.Node)v7).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = 18;
    ((com.google.javascript.rhino.Node)v10).setLineno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSourceOffset();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isSyntheticBlock();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getSourceOffset();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setLineno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).siblings();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).wasEmptyNode();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = -6;
    Object v12 = true;
    ((com.google.javascript.rhino.Node)v10).putBooleanProp((((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v14));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).children();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v5).setOptionalArg((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.rhino.Node)v9).addChildrenToBack(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setOptionalArg((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.rhino.Node)v9).addChildToBack(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v13));
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v14).setOptionalArg((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = 20;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getIntProp((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isVarArgs();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = 64;
    ((com.google.javascript.rhino.Node)v10).setCharno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toStringTree();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJsDocBuilderForNode();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJSDocInfo();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSourceFileName();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getStaticSourceFile();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).children();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOnlyModifiesThisCall();
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isFromExterns();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = -22;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getIntProp((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).srcrefTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isSyntheticBlock();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeChildren();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = "protot(pe";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isOnlyModifiesThisCall();
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v12).srcref(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.Node[]{};
    Object v4 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v3));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).srcrefTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.rhino.IR.script(((com.google.javascript.rhino.Node[])v11));
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v12).setVarArgs((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }
}
