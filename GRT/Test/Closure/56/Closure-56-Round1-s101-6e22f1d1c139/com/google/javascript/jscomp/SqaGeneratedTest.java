package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "GET_COMPILER_OVER/RIDES";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getOriginalPath();
    org.junit.Assert.assertEquals((Object)("GET_COMPILER_OVER/RIDES"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "GET_COMPILER_OVER/RIDES";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = 28;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "GET_COMPILER_OVER/RIDES";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "FALSE";
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = -35;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLine((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)("eva2l"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getRegion((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.SourceFile)v3).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = -57;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLineOffset((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "4";
    Object v1 = "-";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.lang.String)v1),((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 3;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLineOffset((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLine((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).toString();
    org.junit.Assert.assertEquals((Object)("\\"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLine((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getNumLines();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getCodeReader();
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "4";
    Object v1 = "-";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.lang.String)v1),((java.io.InputStream)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getCodeReader();
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getCode();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = -30;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLine((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 27;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getRegion((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "undefined";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).getOriginalPath();
    org.junit.Assert.assertEquals((Object)("undefined"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "default";
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.lang.String)v1),((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "{main}";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "f";
    ((com.google.javascript.jscomp.SourceFile)v4).setOriginalPath(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = -45;
    Object v8 = ((com.google.javascript.jscomp.SourceFile)v4).getLine((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 31;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLineOffset((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceFile)v4).getLine((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.jscomp.SourceFile)v4).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).isExtern();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getCode();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "4";
    Object v1 = "-";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.lang.String)v1),((java.io.InputStream)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "dangerous use of the global 'this' object";
    Object v1 = "U";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v0),((java.io.Reader)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getCodeReader();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "JSCompiler_alias_NULL";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).getOriginalPath();
    org.junit.Assert.assertEquals((Object)("JSCompiler_alias_NULL"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    Object v4 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getName();
    org.junit.Assert.assertEquals((Object)("b"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).isExtern();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 5;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLine((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getOriginalPath();
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getName();
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = 4;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v1).getLine((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getOriginalPath();
    org.junit.Assert.assertEquals((Object)("a"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).length();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.jscomp.SourceFile)v1).setIsExtern((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getName();
    org.junit.Assert.assertEquals((Object)("_"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = -27;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLineOffset((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = 31;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 2;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 14;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getRegion((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.SourceFile)v3).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "dangerous use of the global 'this' object";
    Object v1 = "U";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v0),((java.io.Reader)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).toString();
    org.junit.Assert.assertEquals((Object)("/}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLine((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)("S"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 14;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLine((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.jscomp.SourceFile)v3).getNumLines();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "[";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).length();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v4));
    Object v6 = 5;
    Object v7 = ((com.google.javascript.jscomp.SourceFile)v5).getLine((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).getName();
    org.junit.Assert.assertEquals((Object)("ca6l"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "number";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).getNumLines();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getOriginalPath();
    org.junit.Assert.assertEquals((Object)(" nqot found in graph"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "[";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    ((com.google.javascript.jscomp.SourceFile)v2).clearCachedSource();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getLineOffset((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2));
    Object v4 = 14;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getRegion((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((com.google.javascript.jscomp.SourceFile)v3).getLineOffset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "default";
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.lang.String)v1),((java.io.InputStream)v2));
    Object v4 = 29;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getRegion((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "[";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = -33;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v2).getLine((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).length();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v4));
    Object v6 = ((com.google.javascript.jscomp.SourceFile)v5).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v1).getLineOffset((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Non-JSDoc comment has annotations. Did you mean to start it wih '/**'?";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getCode();
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "pgrototype";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).length();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v4));
    ((com.google.javascript.jscomp.SourceFile)v5).clearCachedSource();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "/scrip";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v1).getLineOffset((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 8;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "ca6l";
    Object v1 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.jscomp.SourceFile)v1).hasSourceInMemory();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "~";
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v0),((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "K";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = " byts";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = 42;
    Object v3 = ((com.google.javascript.jscomp.SourceFile)v1).getRegion((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = "S";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v3).getCodeNoCache();
    org.junit.Assert.assertEquals((Object)("S"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "_";
    Object v1 = " nqot found in graph";
    Object v2 = "eva2l";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 3;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLine((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    Object v2 = "E";
    ((com.google.javascript.jscomp.SourceFile)v1).setOriginalPath(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.SourceFile)v1).getNumLines();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "dangerous use of the global 'this' object";
    Object v1 = "U";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v0),((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = ((com.google.javascript.jscomp.SourceFile)v3).getLine((((java.lang.Integer)v4).intValue()));
    Object v6 = -12;
    Object v7 = ((com.google.javascript.jscomp.SourceFile)v3).getRegion((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "dangerous use of the global 'this' object";
    Object v1 = "U";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v0),((java.io.Reader)v2));
    Object v4 = "";
    ((com.google.javascript.jscomp.SourceFile)v3).setOriginalPath(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = -29;
    Object v7 = ((com.google.javascript.jscomp.SourceFile)v3).getLineOffset((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = "}";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    Object v4 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v5));
    Object v7 = true;
    ((com.google.javascript.jscomp.SourceFile)v6).setIsExtern((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "arguments";
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.SourceFile.fromGenerator(((java.lang.String)v0),((com.google.javascript.jscomp.SourceFile.Generator)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "DEFAULT";
    Object v1 = new com.google.javascript.jscomp.SourceFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
