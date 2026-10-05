package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 36;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = -26;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getJSDocInfo();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    Object v5 = ((com.google.javascript.rhino.Node)v1).toString((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11;
    Object v7 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -55;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 57;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 26;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isVarArgs();
    Object v3 = -35;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -8;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -37;
    ((com.google.javascript.rhino.Node)v1).setLineno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -36;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -9;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toString();
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getAncestors();
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -12;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -20;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isNoSideEffectsCall();
    Object v3 = 21;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).copyInformationFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = 1;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 23;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getSideEffectFlags();
    Object v3 = 68;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 75;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = 0;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).setString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 9;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 18;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "V";
    Object v3 = new com.google.javascript.rhino.InputId(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).setInputId(((com.google.javascript.rhino.InputId)v3));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isVarArgs();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 83;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).setString(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = -3;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "V";
    Object v3 = new com.google.javascript.rhino.InputId(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).setInputId(((com.google.javascript.rhino.InputId)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -15;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -60;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -39;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 2147483647;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 16;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 10;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getInputId();
    Object v3 = -35;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setWasEmptyNode((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = -5;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 11;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildrenToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 79;
    ((com.google.javascript.rhino.Node)v1).setType((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = -13;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -26;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -54;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setIsSyntheticBlock((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 13;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -21;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -4;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).isEquivalentToTyped(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v3));
    Object v5 = 1;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 4;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 6;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).setSourceFileForTesting(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isSyntheticBlock();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 24;
    ((com.google.javascript.rhino.Node)v1).setSourceEncodedPositionForTree((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -40;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 45;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 35;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isFromExterns();
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    ((com.google.javascript.rhino.Node)v1).detachChildren();
    Object v2 = null;
    Object v3 = 17;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = "argument2s";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    ((com.google.javascript.rhino.Node)v1).putProp((((java.lang.Integer)v2).intValue()),((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = -23;
    Object v7 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getString();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 1;
    ((com.google.javascript.rhino.Node)v1).setSourceEncodedPosition((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setVarArgs((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "V";
    Object v3 = new com.google.javascript.rhino.InputId(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).setInputId(((com.google.javascript.rhino.InputId)v3));
    Object v4 = null;
    Object v5 = 4;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.google.javascript.rhino.Node)v1).getBooleanProp((((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getQualifiedName();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -40;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -25;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v2));
    Object v3 = null;
    Object v4 = -7;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 28;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -52;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -6;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).siblings();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isFromExterns();
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildrenToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = -44;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 16;
    Object v3 = ((com.google.javascript.rhino.Node)v1).getIntProp((((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.rhino.Node)v1).setIsSyntheticBlock((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = 26;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 2;
    Object v3 = 0;
    ((com.google.javascript.rhino.Node)v1).putIntProp((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).copyInformationFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).srcref(((com.google.javascript.rhino.Node)v3));
    Object v5 = 0;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -36;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).clonePropsFrom(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(12), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -33;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -22;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 2;
    Object v3 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getLength();
    Object v3 = 42;
    Object v4 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildrenToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = 35;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).setType((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -15;
    Object v5 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "argument2s";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "argument2s";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = 0;
    Object v6 = com.google.javascript.jscomp.InlineCostEstimator.getCost(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v6);
  }
}
