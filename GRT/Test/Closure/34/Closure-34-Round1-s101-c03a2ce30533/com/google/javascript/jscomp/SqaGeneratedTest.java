package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "O";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("O"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "_";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v3).addChildrenToFront(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeFirstChild();
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = " f-> ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" f-> "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "5";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"5\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "z";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"z\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "M";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("M"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "y";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("y"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = "`";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = true;
    Object v6 = true;
    Object v7 = ((com.google.javascript.rhino.Node)v3).toString((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "iID";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "3";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "r";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Enclosing method-does not match ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Enclosing method-does not match "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Functi0on";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = ":";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "4 ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Consider fixing errors for the foplowing types: ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Consider fixing errors for the foplowing types: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("//"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "H";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "g";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "unde*fined";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/unde*fined/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).isFromExterns();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    ((com.google.javascript.rhino.Node)v3).setWasEmptyNode((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "[";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v3).addChildToFront(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "BY_PADRT";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = 1;
    ((com.google.javascript.rhino.Node)v3).setLength((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).isEquivalentTo(((com.google.javascript.rhino.Node)v4));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "LICENSE";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("LICENSE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).copyInformationFromForTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
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
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "LD";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "H";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("H"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
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
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "  ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).isFromExterns();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "D";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Q";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Q"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "G";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("G"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = -36;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getBooleanProp((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = 1;
    ((com.google.javascript.rhino.Node)v3).setLength((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "\\t";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "s";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "6";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("6"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "'";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "t";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("t"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = ".prototyp^e";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "4";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Function";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "!";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = " M=> ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" M=> "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "o";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "0";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneNode();
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = ((com.google.javascript.rhino.Node)v3).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v4));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "X";
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1));
    org.junit.Assert.assertEquals((Object)("/X/"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "argument";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("argument"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).isNoSideEffectsCall();
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "pmrototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/pmrototype/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((java.nio.charset.Charset)v1));
    Object v3 = com.google.javascript.rhino.IR.nullNode();
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
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
  public void test98() throws Throwable {
    Object v0 = " ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "+";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }
}
