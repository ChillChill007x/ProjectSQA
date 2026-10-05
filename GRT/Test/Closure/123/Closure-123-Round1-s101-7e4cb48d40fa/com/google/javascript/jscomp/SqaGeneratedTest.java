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
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "unexpected";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSourceOffset();
    ((com.google.javascript.jscomp.CodeGenerator)v1).addAllSiblings(((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v1).addArrayList(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "";
    Object v3 = ((com.google.javascript.jscomp.CodeGenerator)v1).escapeToDoubleQuotedJsString(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("\"\""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "g";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v1).addAllSiblings(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "undefined";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v5).setVarArgs((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addArrayList(((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    ((com.google.javascript.jscomp.CodeGenerator)v1).tagAsStrict();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "pr\\totype";
    Object v3 = ((com.google.javascript.jscomp.CodeGenerator)v1).regexpEscape(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("/pr\\totype/"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Bad output file (already listed as input file): {0}";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getChangeTime();
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "generateReport";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v5).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "c";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "goog";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "proto\"type";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("proto\"type"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "";
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "Z";
    Object v3 = ((com.google.javascript.jscomp.CodeGenerator)v1).regexpEscape(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("/Z/"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "rem";
    Object v3 = ((com.google.javascript.jscomp.CodeGenerator)v1).regexpEscape(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("/rem/"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v1).addCaseBody(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "$p";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("$p"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v5).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.CodeGenerator)v1).addAllSiblings(((com.google.javascript.rhino.Node)v5));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Total Static Functions: ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Total Static Functions: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Object";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "func";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "v";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("v"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "[";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 22;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "p";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).wasEmptyNode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isOptionalArg();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "prototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "printNameRef";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("printNameRef"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).escapeToDoubleQuotedJsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getQualifiedName();
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(","), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "<ul>\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("<ul>\n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = "_";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "~";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -40;
    Object v8 = 0;
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v6).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v6));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "J>C_CIRCULAR_DEP";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\n5";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = "JS\\ompiler_returnArg";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.TreeSet();
    Object v8 = new java.util.HashSet(((java.util.Collection)v7));
    ((com.google.javascript.rhino.Node)v6).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "WARNING";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "!";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "$}";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "@";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("@"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSourceFileName();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "g";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("g"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Function";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "w";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("w"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -40;
    Object v8 = 0;
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v6).addChildToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v14 = ((java.lang.Enum)v13).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "w";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = ":";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }
}
