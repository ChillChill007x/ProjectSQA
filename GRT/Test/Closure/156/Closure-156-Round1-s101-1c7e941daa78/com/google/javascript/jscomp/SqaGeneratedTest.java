package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 16;
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    ((com.google.javascript.rhino.Node)v10).setType((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.HashSet();
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).isEquivalentToTyped(((com.google.javascript.rhino.Node)v7));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = "U  ";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeEquals(((com.google.javascript.rhino.Node)v7));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 8;
    Object v7 = 11;
    ((com.google.javascript.rhino.Node)v5).putIntProp((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.HashSet();
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v5).setVarArgs((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 87;
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildrenToBack(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v5).setIsSyntheticBlock((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).removeProp((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "d";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).hasSideEffects();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = "N";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).toString();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.HashSet();
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.rhino.Node)v7).detachChildren();
    Object v8 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildToFront(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).copyInformationFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildAfter(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v7).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setOptionalArg((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.HashSet();
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = "NoObject";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildAfter(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).siblings();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = -59;
    ((com.google.javascript.rhino.Node)v5).setType((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).hasSideEffects();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getAncestor((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 6;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).clonePropsFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.HashSet();
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).isEquivalentToTyped(((com.google.javascript.rhino.Node)v12));
    Object v14 = 25;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v15).setVarArgs((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = "T";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 27;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 11;
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = "mismatch of the {0} property type and the type of the property it overrides from superclass {1";
    ((com.google.javascript.rhino.Node)v12).addSuppression(((java.lang.String)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).isEquivalentTo(((com.google.javascript.rhino.Node)v7));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new java.io.StringWriter((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v8).appendStringTree(((java.lang.Appendable)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = -34;
    ((com.google.javascript.rhino.Node)v14).setType((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = 25;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).setLineno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setWasEmptyNode((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).toStringTree();
    Object v16 = 25;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v14).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = 25;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getQualifiedName();
    Object v16 = 25;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    Object v16 = 25;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 25;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v17).copyInformationFromForTree(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v8).addChildrenToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    Object v17 = 25;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v16).copyInformationFrom(((com.google.javascript.rhino.Node)v18));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).siblings();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).cloneNode();
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    Object v17 = 0;
    Object v18 = new java.io.StringWriter((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.rhino.Node)v16).appendStringTree(((java.lang.Appendable)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 25;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v14).addChildrenToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = 25;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    ((com.google.javascript.rhino.Node)v19).setVarArgs((((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 29;
    ((com.google.javascript.rhino.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = 25;
    Object v3 = new com.google.javascript.rhino.Node((((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ":";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{";"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeChildren();
    Object v16 = 25;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v12).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }
}
