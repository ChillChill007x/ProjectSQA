package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("I"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "012356789abcdef";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "m";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "(";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "+";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"+\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    ((com.google.javascript.jscomp.CodeGenerator)v2).tagAsStrict();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getAncestors();
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "$";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/$/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "K";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"K\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v8).setOptionalArg((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Expec<ted children to be strings";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Expec<ted children to be strings"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "1";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "o";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "minimizeExitPoints";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Externs zip must";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Externs zip must"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "H";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("H"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "String has leading or &railing whitespace";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "E";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/E/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "s";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("s"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "cat";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("cat"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "v";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "prototy6pe";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "\\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSideEffectFlags();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "}";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "fklse";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "undefied";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "W";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "|";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/|/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = 41;
    Object v10 = 1;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "CONST";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "this";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "c";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("c"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "T";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = ";";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeChildren();
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new java.io.PrintStream(((java.io.OutputStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = "R";
    Object v13 = "bool";
    Object v14 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v17 = ((java.lang.Enum)v16).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CodeGenerator.Context)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "6";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "w";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "n";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "breYak";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = ": ";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\": \""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "@";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "msg.unexpected.eof";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("msg.unexpected.eof"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "U";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("U"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "p";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "\n=";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "prototWype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "\\";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\\"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "&";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = " ";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "JSCompiler_renameProperty";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"JSCompiler_renameProperty\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "V\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "%";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"%\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeFirstChild();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "C";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "C";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = ".p#rototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\\x00";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "A[ray";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "o,";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "'";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"'\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "lineCoun";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "(.prototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = ",";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "(";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "  ";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "NEXT_I_ANNOTATION";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "function (";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "coalesceVariableNames";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "M";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "I";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = "R";
    Object v7 = "bool";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getBooleanProp((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "4";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "i";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "null";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "\\";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }
}
