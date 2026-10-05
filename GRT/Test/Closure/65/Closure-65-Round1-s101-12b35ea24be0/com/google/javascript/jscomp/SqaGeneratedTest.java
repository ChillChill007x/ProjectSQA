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
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).copyInformationFrom(((com.google.javascript.rhino.Node)v6));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v4));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "_";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "msg.jsdoc.au}hormissing";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "labe";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
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
  public void test8() throws Throwable {
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
  public void test9() throws Throwable {
    Object v0 = "A";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).isEquivalentToTyped(((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "'";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"'\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 4;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addLeftExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"\\n\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ".apfply";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(".apfply"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setSourcePositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "].";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]."), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "\"";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
  public void test25() throws Throwable {
    Object v0 = "0";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "`";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = ".";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "]";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -50;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -3;
    Object v6 = ".apfply";
    Object v7 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v4).putProp((((java.lang.Integer)v5).intValue()),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "T";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addLeftExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = " anop functions using ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "convertToDottedProp";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("convertToDottedProp"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "H";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "bito&";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = ":";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(":"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "\"";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("'\"'"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "[";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "arguXents";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/arguXents/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "R";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"R\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "prototyp";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).jsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"prototyp\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "protot#pe";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("protot#pe"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "Object";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "6";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "?";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = Character.valueOf((char)3);
    Object v2 = "{";
    Object v3 = "v";
    Object v4 = "collapseAnonymousFunctions";
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.strEscape(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4),((java.nio.charset.CharsetEncoder)v5));
    org.junit.Assert.assertEquals((Object)("\u0003\u0003"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = 1;
    ((com.google.javascript.rhino.Node)v5).setLineno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    ((com.google.javascript.jscomp.CodeGenerator)v3).addAllSiblings(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "names";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/names/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "undefined";
    ((com.google.javascript.jscomp.CodeGenerator)v2).addJsString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    ((com.google.javascript.jscomp.CodeGenerator)v3).addArrayList(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    ((com.google.javascript.jscomp.CodeGenerator)v3).addJsString(((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = ((com.google.javascript.jscomp.CodeGenerator)v3).jsString(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("\"\""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = 2;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addExpr(((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "_";
    ((com.google.javascript.jscomp.CodeGenerator)v3).addJsString(((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = -21;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v3).addLeftExpr(((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = ";";
    Object v5 = ((com.google.javascript.jscomp.CodeGenerator)v3).jsString(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("\";\""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = " ";
    Object v5 = ((com.google.javascript.jscomp.CodeGenerator)v3).jsString(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("\" \""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = " ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "^";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v5).addChildrenToFront(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addArrayList(((com.google.javascript.rhino.Node)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = 1;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addExpr(((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeEquals(((com.google.javascript.rhino.Node)v7));
    ((com.google.javascript.jscomp.CodeGenerator)v3).addArrayList(((com.google.javascript.rhino.Node)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).children();
    Object v7 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).isEquivalentTo(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v5).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = -12;
    Object v7 = "arguXents";
    Object v8 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = -28;
    ((com.google.javascript.rhino.Node)v5).setType((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v3).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addLeftExpr(((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "w";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).copyInformationFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v3).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((java.nio.charset.Charset)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v3).addLeftExpr(((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
