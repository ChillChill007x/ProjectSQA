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
    Object v6 = "\\n";
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
    Object v0 = "Class {0} has been deprecated.";
    Object v1 = "(";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$Class {0} has been deprecated."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "\\n";
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
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    Object v11 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.breakNode();
    Object v14 = com.google.javascript.rhino.IR.breakNode();
    Object v15 = true;
    Object v16 = true;
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.Node)v14).toString((((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = "1";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "s";
    Object v1 = ".";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$s"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "JSCompil=er_renameProperty";
    Object v7 = 0;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = " ";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "z";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
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
  public void test14() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "JSCompil=er_renameProperty";
    Object v7 = 0;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = " ";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v11).getModule();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "()";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "?";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$?"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "$";
    Object v1 = "Boolean";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "|";
    Object v1 = "li {margin-topS3px; margin-left:24px;padding-left:0px;padding-bottom: 4px}";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$|"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = ",";
    Object v1 = "\"";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$,"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "argumeQnts";
    Object v1 = "L~ ";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$argumeQnts"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "+indow";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "y";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$y"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "1";
    Object v1 = "noshaadow";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$1"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "J";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "ALL_UNQUO+TED";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "impor\"";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$impor\""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "-";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$_"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "]";
    Object v1 = ">";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
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
  public void test29() throws Throwable {
    Object v0 = "6,";
    Object v1 = "msg.jsdoc.functKon.varargs";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$6,"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "@";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$@"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "m<odule$";
    Object v1 = "(";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$m<odule$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    ((com.google.javascript.jscomp.AbstractCompiler)v5).reportCodeChange();
    Object v6 = null;
    Object v7 = ")";
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = ":";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$U"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "&";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$&"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "+indow";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "ALL_UNQUO+TED";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "G";
    Object v1 = "unsupported source map forma";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$G"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "sources";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
  public void test41() throws Throwable {
    Object v0 = "goog";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$goog"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
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
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
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
  public void test46() throws Throwable {
    Object v0 = "checkRe";
    Object v1 = "I";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$checkRe"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "implements";
    Object v1 = "pgrototype";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$implements"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "z";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Y";
    Object v1 = "0";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$Y"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Unknown source map ver9ion:";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Incorrect source mappings order, previous : (%s,%s)\nnew : (%s,%s)\nnod4 : %s";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
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
  public void test53() throws Throwable {
    Object v0 = "this";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$this"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "impliments";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$impliments"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "}";
    Object v1 = "=";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
  public void test57() throws Throwable {
    Object v0 = ",";
    Object v1 = "\\\\E";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$,"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "fals";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "JSC_FUNCTION_MASKS_VARIABLE";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "`";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$`"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "(\\.";
    Object v7 = -47;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
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
  public void test63() throws Throwable {
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
  public void test64() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "\t\tcurrent           : %s\n";
    Object v7 = true;
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
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getErrorManager();
    Object v7 = "";
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
  public void test67() throws Throwable {
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
  public void test68() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Unknown source map ver9ion:";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "(\\.";
    Object v7 = -47;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = false;
    Object v11 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.IR.breakNode();
    Object v13 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v11).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = com.google.javascript.rhino.IR.breakNode();
    Object v16 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
  public void test71() throws Throwable {
    Object v0 = "6ST not normalized.";
    Object v1 = "^@.";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$6ST not normalized."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Y";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    ((com.google.javascript.jscomp.AbstractCompiler)v5).reportCodeChange();
    Object v6 = null;
    Object v7 = ")";
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    Object v11 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.breakNode();
    Object v14 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = ": ";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "argumets";
    Object v1 = "DeclarationToRemove";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$argumets"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "p";
    Object v1 = "{";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
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
  public void test78() throws Throwable {
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
  public void test79() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = " oB recently changed AST";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "H";
    Object v1 = "\t\tcollectin time    : %d ms\n";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$H"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "Y";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
  public void test83() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "J";
    Object v7 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6));
    Object v8 = "o";
    Object v9 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v7).guessCJSModuleName(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)("module$o"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "^\\.";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
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
  public void test86() throws Throwable {
    Object v0 = ";";
    Object v1 = "_";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$;"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "B";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).getModule();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "NO_ALIAS";
    Object v1 = "prototype";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$NO_ALIAS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
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
  public void test90() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "G";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "r";
    Object v1 = "=";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$r"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = "Unmatched {1} - {0} not in the same block";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "fals";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "o";
    Object v10 = ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).guessCJSModuleName(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("module$o"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("module$)"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "JS@C_TOO_MANY_ARGUMENTS_ERROR";
    Object v1 = "\\rE";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$JS@C_TOO_MANY_ARGUMENTS_ERROR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "\"";
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    Object v11 = ((com.google.javascript.rhino.Node)v10).getDirectives();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
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
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    Object v11 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v9).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = ",";
    Object v1 = "string";
    Object v2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("module$,"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "b";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "sources";
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.ProcessCommonJSModules(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.rhino.Node)v9).addChildrenToFront(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.rhino.IR.breakNode();
    ((com.google.javascript.jscomp.ProcessCommonJSModules)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }
}
