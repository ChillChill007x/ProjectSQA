package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
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
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v5).setOptionalArg((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
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
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
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
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).hasSideEffects();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v8).addChildrenToFront(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = " -U> ";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeEquals(((com.google.javascript.rhino.Node)v7));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
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
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 5;
    Object v7 = 11;
    ((com.google.javascript.rhino.Node)v5).putIntProp((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
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
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = java.util.Set.copyOf(((java.util.Collection)v6));
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
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
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v7));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v5).setWasEmptyNode((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setType((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = 26;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildrenToFront(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.util.ArrayList();
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    ((com.google.javascript.rhino.Node)v8).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 26;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = -17;
    ((com.google.javascript.rhino.Node)v7).setCharno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = true;
    Object v13 = false;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 26;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = new java.util.ArrayList();
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).hasSideEffects();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).children();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v7));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v6).addChildAfter(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeChildren();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v9).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toString();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).clonePropsFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = 26;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).children();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = -12;
    ((com.google.javascript.rhino.Node)v7).setCharno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v8));
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getAncestors();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v6).addChildAfter(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).siblings();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = -3;
    ((com.google.javascript.rhino.Node)v5).setType((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = "d";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v7),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getQualifiedName();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneTree();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = -2;
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).removeFirstChild();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeFirstChild();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).copyInformationFromForTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = 26;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeFirstChild();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getAncestors();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setIsSyntheticBlock((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).clonePropsFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).hasSideEffects();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).siblings();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v6).appendStringTree(((java.lang.Appendable)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).copyInformationFromForTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = 26;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeFirstChild();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = 26;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildAfter(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 26;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).siblings();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.Node)v8).toString((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.rhino.Node)v6).addChildrenToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v8));
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.rhino.Node)v8).detachChildren();
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v6).setIsSyntheticBlock((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getQualifiedName();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = -8;
    ((com.google.javascript.rhino.Node)v6).setCharno((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).children();
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = java.util.Set.copyOf(((java.util.Collection)v7));
    ((com.google.javascript.rhino.Node)v6).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = 26;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildAfter(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).removeChildren();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 8;
    Object v10 = -32;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 26;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v12).setOptionalArg((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 26;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).hasSideEffects();
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).clonePropsFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 26;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 26;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 26;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 26;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 18;
    ((com.google.javascript.rhino.Node)v11).removeProp((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 26;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    Object v8 = 26;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CollapseProperties(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 26;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.Node)v6).toString((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 26;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.CollapseProperties)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }
}
