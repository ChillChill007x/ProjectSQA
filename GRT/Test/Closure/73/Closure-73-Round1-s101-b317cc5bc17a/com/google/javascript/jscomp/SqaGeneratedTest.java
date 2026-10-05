package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
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
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
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
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
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
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "null";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v4).addChildToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).siblings();
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 57;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addLeftExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "NaNf";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setSourcePositionForTree((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "ad line: ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ad line: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "prototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/prototype/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
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
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "+enum";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "prototypQe";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
  public void test24() throws Throwable {
    Object v0 = "`";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
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
  public void test26() throws Throwable {
    Object v0 = "Access to private variable {0} not allowed outside file {1}.";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "]";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v4).addChildrenToBack(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
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
  public void test30() throws Throwable {
    Object v0 = "argum)nts";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
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
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isQualifiedName();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 26;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addLeftExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " Reference nod6e ";
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.CodeGenerator.jsString(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1));
    org.junit.Assert.assertEquals((Object)("\" Reference nod6e \""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
    Object v0 = ".prototBpe.";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(".prototBpe."), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "7";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("7"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
  public void test42() throws Throwable {
    Object v0 = "Q";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 1;
    ((com.google.javascript.rhino.Node)v4).setLineno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
    Object v0 = "v";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(")"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v4).addChildrenToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v4));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    ((com.google.javascript.rhino.Node)v4).addSuppression(((java.lang.String)v5));
    Object v6 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 1;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "(";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"(\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "z";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v7 = null;
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
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
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
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "D";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("D"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "JSC_INVALID_DEFINE_INIT_ERROR";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "<";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("<"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJsDocBuilderForNode();
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).isEquivalentTo(((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "publc";
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.CodeGenerator.jsString(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1));
    org.junit.Assert.assertEquals((Object)("\"publc\""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -14;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "\n1";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "JSC_TWEAK_WRONG_GETTER_TYPE_WARNING";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("JSC_TWEAK_WRONG_GETTER_TYPE_WARNING"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "wlith(";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v4).addChildToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "ReerenceError";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "w";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "t";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("t"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "continu^e";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "U";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "=prototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "^";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).toStringTree();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
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
  public void test85() throws Throwable {
    Object v0 = "pototype";
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.CodeGenerator.jsString(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1));
    org.junit.Assert.assertEquals((Object)("\"pototype\""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
  public void test87() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/arguments/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = "publc";
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.jsString(((java.lang.String)v6),((java.nio.charset.CharsetEncoder)v7));
    ((com.google.javascript.rhino.Node)v4).putProp((((java.lang.Integer)v5).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 0;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "proVtotype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = "\n1";
    Object v7 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v4).putProp((((java.lang.Integer)v5).intValue()),((java.lang.Object)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v4));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -17;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addLeftExpr(((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isQualifiedName();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Best time: ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "\\r";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }
}
