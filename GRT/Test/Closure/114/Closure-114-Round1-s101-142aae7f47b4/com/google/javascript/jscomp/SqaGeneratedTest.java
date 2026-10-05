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
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getProp((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v6).setVarArgs((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getQualifiedName();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJSDocInfo();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v4).srcref(((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v5).addChildToBack(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneNode();
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    Object v11 = ((com.google.javascript.rhino.Node)v9).clonePropsFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).wasEmptyNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = false;
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.rhino.Node)v7).toString((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setLineno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).isSyntheticBlock();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).isSyntheticBlock();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 12;
    ((com.google.javascript.rhino.Node)v4).setLength((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).getStaticSourceFile();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v5).setVarArgs((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeChildren();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getJSDocInfo();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = -3;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getBooleanProp((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.NameAnalyzer)v2).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).removeUnreferenced();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneTree();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).toStringTree();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeChildren();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v8).mayMutateArguments();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 36;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getBooleanProp((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v3).addChildToBack(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setLength((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).isOptionalArg();
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = new com.google.javascript.rhino.JSDocInfo();
    Object v8 = ((com.google.javascript.rhino.Node)v6).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v7));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    Object v6 = ((com.google.javascript.rhino.Node)v4).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    ((com.google.javascript.rhino.Node)v3).setWasEmptyNode((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).isVarArgs();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getLength();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJSDocInfo();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v4).addChildrenToFront(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = -65;
    ((com.google.javascript.rhino.Node)v3).setSourceEncodedPosition((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).srcref(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 0;
    ((com.google.javascript.rhino.Node)v6).setLineno((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getAncestors();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getChangeTime();
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).wasEmptyNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setVarArgs((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).toStringTree();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = false;
    Object v6 = true;
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.Node)v4).toString((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).getAncestors();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 32;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSourceFileName();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).toStringTree();
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).srcrefTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).isFromExterns();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v4).getChangeTime();
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).srcrefTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v10).detachChildren();
    Object v11 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = -10;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getIntProp((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).isSyntheticBlock();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).getSourceOffset();
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).isSyntheticBlock();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = "";
    ((com.google.javascript.rhino.Node)v5).setSourceFileForTesting(((java.lang.String)v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).copyInformationFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).mayMutateArguments();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).removeUnreferenced();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v5).isEquivalentToShallow(((com.google.javascript.rhino.Node)v6));
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setLength((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = -24;
    ((com.google.javascript.rhino.Node)v3).setLength((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getStaticSourceFile();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).isEquivalentToShallow(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v6).addChildrenToBack(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 13;
    ((com.google.javascript.rhino.Node)v4).setChangeTime((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.NameAnalyzer)v3).getHtmlReport();
    org.junit.Assert.assertEquals((Object)("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = 1;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    ((com.google.javascript.rhino.Node)v4).setDirectives(((java.util.Set)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setIsSyntheticBlock((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.rhino.Node)v4).useSourceInfoFrom(((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.NameAnalyzer(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v6).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v9).setIsSyntheticBlock((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.NameAnalyzer)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }
}
