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
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addAllSiblings(((com.google.javascript.rhino.Node)v5));
    Object v11 = null;
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
    Object v6 = false;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
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
    ((com.google.javascript.rhino.Node)v5).addChildrenToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSideEffectFlags();
    ((com.google.javascript.jscomp.CodeGenerator)v1).addCaseBody(((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    ((com.google.javascript.jscomp.CodeGenerator)v1).addArrayList(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "r";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildrenToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ".";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "|";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "6:";
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
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "[";
    Object v3 = ((com.google.javascript.jscomp.CodeGenerator)v1).escapeToDoubleQuotedJsString(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("\"[\""), v3);
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
    Object v6 = 0;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getAncestor((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "goog.testing.ObjectPropertyString instantiated ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
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
  public void test26() throws Throwable {
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
  public void test27() throws Throwable {
    Object v0 = "Unexpected const change.\n ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setChangeTime((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
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
    Object v6 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v1).addList(((com.google.javascript.rhino.Node)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
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
    Object v6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CodeGenerator.Context)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = " O ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    Object v2 = "'";
    ((com.google.javascript.jscomp.CodeGenerator)v1).add(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    ((com.google.javascript.jscomp.CodeGenerator)v1).addAllSiblings(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " ";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
  public void test39() throws Throwable {
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
  public void test40() throws Throwable {
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
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    org.junit.Assert.assertNotNull(v2);
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
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "REGULAR";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("REGULAR"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Object";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Object"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 21;
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v6).putBooleanProp((((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6));
    Object v10 = null;
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
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "[";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("["), v1);
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
    Object v7 = 4;
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v6).putBooleanProp((((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Ddeprecated";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
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
    Object v7 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v8 = false;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "REGULAR";
    Object v11 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v12));
    Object v14 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v15 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v14));
    ((com.google.javascript.rhino.Node)v6).setDirectives(((java.util.Set)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v6));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isLocalResultCall();
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v7 = "k";
    Object v8 = new com.google.javascript.rhino.InputId(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v6).setInputId(((com.google.javascript.rhino.InputId)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "wite";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "H";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("H"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.CodeGenerator)v2).tagAsStrict();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).escapeToDoubleQuotedJsString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = ",";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).regexpEscape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("/,/"), v4);
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
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
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
    Object v11 = ((com.google.javascript.rhino.Node)v6).clonePropsFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CodeGenerator)v2).addArrayList(((com.google.javascript.rhino.Node)v6));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = "";
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Type names cannot contain template annotations.";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
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
  public void test67() throws Throwable {
    Object v0 = "superClass_";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "B";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
  public void test71() throws Throwable {
    Object v0 = "bind";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
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
    ((com.google.javascript.jscomp.CodeGenerator)v2).addCaseBody(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "t";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "L";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
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
  public void test76() throws Throwable {
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
  public void test77() throws Throwable {
    Object v0 = "nuber";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Type tightener culd not find variable with name %s";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
  public void test80() throws Throwable {
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
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
  public void test83() throws Throwable {
    Object v0 = "-";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = ":";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).regexpEscape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("/:/"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = true;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = "&";
    Object v4 = ((com.google.javascript.jscomp.CodeGenerator)v2).regexpEscape(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("/&/"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 15;
    ((com.google.javascript.rhino.Node)v6).setLineno((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    ((com.google.javascript.jscomp.CodeGenerator)v2).add(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CodeGenerator.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "ERROR";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
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
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v10 = null;
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
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
    ((com.google.javascript.jscomp.CodeGenerator)v2).addList(((com.google.javascript.rhino.Node)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.CodeGenerator.Context)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CodeGenerator(((com.google.javascript.jscomp.CodeConsumer)v0),((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v3 = -40;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).siblings();
    ((com.google.javascript.jscomp.CodeGenerator)v2).addAllSiblings(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "M";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "prototype";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "f1nction";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("f1nction"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "prototyHe";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(((com.google.javascript.jscomp.CodeConsumer)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "undefined";
    Object v1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("undefined"), v1);
  }
}
