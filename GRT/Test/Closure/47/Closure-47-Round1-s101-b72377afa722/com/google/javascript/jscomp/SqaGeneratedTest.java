package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    ((com.google.javascript.jscomp.SourceMap)v0).validate((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = 18;
    Object v5 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v5),((com.google.debugging.sourcemap.FilePosition)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = 4;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.SourceMap)v0).reset();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getQualifiedName();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = 102;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = 102;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v14));
    ((com.google.javascript.jscomp.SourceMap)v0).setPrefixMappings(((java.util.List)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "/";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).toString();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = 44;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "e";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).removeFirstChild();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v2).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v3));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = 1;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 53;
    Object v4 = ((com.google.javascript.rhino.Node)v2).getProp((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -11;
    Object v2 = 0;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 48;
    Object v2 = 22;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).children();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getInputId();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = 16;
    ((com.google.javascript.rhino.Node)v2).putIntProp((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getAncestors();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = 21;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -3;
    Object v2 = 39;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isLocalResultCall();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 50;
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v2).putProp((((java.lang.Integer)v3).intValue()),((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "!";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "f";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 17;
    Object v4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    ((com.google.javascript.rhino.Node)v2).putProp((((java.lang.Integer)v3).intValue()),((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getStaticSourceFile();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isQualifiedName();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = 45;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = "t";
    ((com.google.javascript.rhino.Node)v2).addSuppression(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -4;
    Object v2 = -35;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -22;
    Object v2 = 1;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "Unknown version: ";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).copyInformationFromForTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "&";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    ((com.google.javascript.jscomp.SourceMap)v0).validate((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getLength();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.rhino.Node)v2).addChildToBack(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "ate";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isNoSideEffectsCall();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = 102;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = 102;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((java.util.Collection)v15).parallelStream();
    ((com.google.javascript.jscomp.SourceMap)v0).setPrefixMappings(((java.util.List)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).removeChildren();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    ((com.google.javascript.rhino.Node)v2).appendStringTree(((java.lang.Appendable)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((com.google.javascript.rhino.Node)v2).setCharno((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((com.google.javascript.rhino.Node)v2).setLength((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 11;
    Object v4 = ((com.google.javascript.rhino.Node)v2).getBooleanProp((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "property {0} on interface {1} is not imp";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = 102;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v7));
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = 102;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((java.util.List)v15).spliterator();
    ((com.google.javascript.jscomp.SourceMap)v0).setPrefixMappings(((java.util.List)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = 0;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " && ";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).isEquivalentToTyped(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 2;
    Object v2 = 0;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "n";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.DotFormatter.toDot(((com.google.javascript.rhino.Node)v4));
    Object v6 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v5));
    Object v7 = "";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "+";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -3;
    Object v2 = -17;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getSideEffectFlags();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "SAFE_TO_FOLD_WITH_AAGS";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.rhino.Node)v2).addChildrenToBack(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).clonePropsFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "`";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "prototyp";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = 1;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = -25;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getSourceOffset();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isSyntheticBlock();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "K\n";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "K";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "OBJECTLIT";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "__";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.DotFormatter.toDot(((com.google.javascript.rhino.Node)v4));
    Object v6 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v5));
    Object v7 = "JSCompiler_renameProperty";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ":";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -2;
    Object v2 = 1;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = "call";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v4));
    ((com.google.javascript.rhino.Node)v2).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = 18;
    Object v12 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v9),((com.google.debugging.sourcemap.FilePosition)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = ",";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 31;
    ((com.google.javascript.rhino.Node)v2).setSourceEncodedPositionForTree((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "prototype";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).isEquivalentTo(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = -26;
    ((com.google.javascript.rhino.Node)v2).setLength((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 18;
    Object v7 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 18;
    Object v10 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v7),((com.google.debugging.sourcemap.FilePosition)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneNode();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "R";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = -25;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).copyInformationFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "}";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = "|";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = 0;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isFromExterns();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "e";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = false;
    ((com.google.javascript.rhino.Node)v2).putBooleanProp((((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = true;
    Object v4 = true;
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.Node)v2).toString((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = 18;
    Object v12 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v9),((com.google.debugging.sourcemap.FilePosition)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 7;
    Object v2 = 8;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isUnscopedQualifiedName();
    Object v4 = 1;
    Object v5 = 18;
    Object v6 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 18;
    Object v9 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v6),((com.google.debugging.sourcemap.FilePosition)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v1));
    Object v3 = ".";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 102;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 102;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v2).useSourceInfoFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = 1;
    Object v7 = 18;
    Object v8 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 18;
    Object v11 = new com.google.debugging.sourcemap.FilePosition((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v2),((com.google.debugging.sourcemap.FilePosition)v8),((com.google.debugging.sourcemap.FilePosition)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
