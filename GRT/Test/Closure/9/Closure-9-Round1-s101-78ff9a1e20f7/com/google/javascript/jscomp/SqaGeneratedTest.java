package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = ")";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$I"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "-";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "()";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "Object";
    Object v1 = "return";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$Object"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "-";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    ((com.google.javascript.jscomp.AbstractCompiler)v5).reportCodeChange();
    Object v6 = null;
    Object v7 = "";
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    ((com.google.javascript.jscomp.AbstractCompiler)v5).reportCodeChange();
    Object v6 = null;
    Object v7 = "";
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ".p";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = ".p";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = ".p";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = ".p";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = "T";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "f";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$f"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "$$";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getProgress();
    Object v7 = "";
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "boolea";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = "6";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getProgress();
    Object v7 = "";
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7));
    Object v9 = "arguments";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$arguments"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ")\\s*\\((.*?)\\)";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "$";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$$"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "</ul>S";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Unknow class name";
    Object v1 = "goog.testing.ObjectProZpertyString";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$Unknow class name"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = "1";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "K";
    Object v1 = "M";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = ".prototype";
    Object v1 = "o";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$.prototype"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = "L";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ": ";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "!";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$!"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = "I";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " => ";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$ => "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "T";
    Object v1 = " ";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$T"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "0";
    Object v7 = 1;
    Object v8 = ".p";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = "(";
    Object v12 = "JSCompiler_object_inline_";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"G","",""};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.AbstractCompiler)v5).report(((com.google.javascript.jscomp.JSError)v15));
    Object v16 = null;
    Object v17 = "1";
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "U";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "</ul>S";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ": ";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "G";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$G"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "[";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "B";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "transitive-dependencies";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$transitive_dependencies"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "u";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "null deepest common modul";
    Object v1 = "I";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$null deepest common modul"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "extends";
    Object v1 = "pgrototype";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$extends"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getProgress();
    Object v7 = "";
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Y";
    Object v1 = "0";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$Y"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "JSO9 parse exception: ";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "4";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "\"";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "this";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$this"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "exiends";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$exiends"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "y";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$y"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "0";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "$";
    Object v1 = "=";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "~";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = ",";
    Object v1 = "ECMASCRIEPT3";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$,"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ".";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "right operand";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "`";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$`"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "(RegExp";
    Object v7 = -47;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Y";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "W";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "verbose";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getErrorManager();
    Object v7 = "";
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Q";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "G";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "4";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "(RegExp";
    Object v7 = -47;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = ".p";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 1;
    Object v20 = ".p";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = ".p";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v11).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "T";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = ":t6is";
    Object v1 = "@$";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$:t6is"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "(RegExp";
    Object v7 = -47;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v11).guessCJSModuleName(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)("module$"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ": ";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = ".p";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = ".p";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "_";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$_"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "argumets";
    Object v1 = "''";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$argumets"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "p";
    Object v1 = "{";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "5";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = 0;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "w";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "com.google.javascript.jscomB.parsing.ParserConfig";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "H";
    Object v1 = "\t\tcurent           : %s\n";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$H"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "W";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "o";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "</ul>S";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "o";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$o"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "module$";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ";";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "}";
    Object v1 = "_";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "[";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "DICT";
    Object v1 = "prototype";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$DICT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getTopScope();
    Object v7 = "T";
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "G";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "r";
    Object v1 = "=";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$r"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = ":this";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ".";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "o";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$o"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$)"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "JSC_DUPLICATE@_NAMESPACE_ERROR";
    Object v1 = "-E";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$JSC_DUPLICATE@_NAMESPACE_ERROR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "0";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getDirectives();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getErrorManager();
    Object v7 = "";
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ".p";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = ".p";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "]";
    Object v1 = "string";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "U";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = ".p";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ".p";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v11).addChildrenToFront(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = ".p";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "G";
    Object v1 = "FUN+TION_INSTANCE_TYPE";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$G"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "<";
    Object v1 = "h";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$<"), v2);
  }
}
