package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.rhino.Node)v6).detachChildren();
    Object v7 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneTree();
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = true;
    ((com.google.javascript.rhino.Node)v4).setWasEmptyNode((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.rhino.Node)v4).addChildToBack(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).setCharno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setWasEmptyNode((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v5).setVarArgs((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).copyInformationFrom(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = -11.586569769898245D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = true;
    Object v14 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = -11.586569769898245D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = -11.586569769898245D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = true;
    Object v22 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v19),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.jscomp.Compiler();
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = true;
    Object v26 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v23),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -11.586569769898245D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v22),((java.lang.Object)v26),((java.lang.Object)v28));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v29));
    Object v30 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0;
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = -9;
    ((com.google.javascript.rhino.Node)v9).setType((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).siblings();
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "$";
    Object v9 = "\"";
    Object v10 = -3;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v5).setJSType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v13 = null;
    Object v14 = -11.586569769898245D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = ((com.google.javascript.rhino.Node)v6).toString((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -11.586569769898245D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = "$";
    Object v10 = "\"";
    Object v11 = -3;
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v6).setJSType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    ((com.google.javascript.rhino.Node)v4).detachChildren();
    Object v5 = null;
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.rhino.Node)v5).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).siblings();
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).putProp((((java.lang.Integer)v8).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v9));
    Object v11 = -11.586569769898245D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v5).appendStringTree(((java.lang.Appendable)v6));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 81;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isQualifiedName();
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).hasSideEffects();
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 48;
    ((com.google.javascript.rhino.Node)v5).setLineno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = "$";
    Object v11 = "\"";
    Object v12 = -3;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v7).setJSType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = -11.586569769898245D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = -11.586569769898245D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "v  ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = -11.586569769898245D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = true;
    Object v14 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = -11.586569769898245D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = -11.586569769898245D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = true;
    Object v22 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v19),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.jscomp.Compiler();
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = true;
    Object v26 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v23),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -11.586569769898245D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v22),((java.lang.Object)v26),((java.lang.Object)v28));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v29));
    Object v30 = null;
    Object v31 = -11.586569769898245D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = -11.586569769898245D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "<";
    Object v2 = -18;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1;
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeChildren();
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "<";
    Object v2 = -18;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).copyInformationFrom(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = -11.586569769898245D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "<";
    Object v2 = -18;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -41.19229119417139D;
    ((com.google.javascript.rhino.Node)v4).setDouble((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getAncestors();
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = -11.586569769898245D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = -11.586569769898245D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = true;
    Object v24 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v21),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = -11.586569769898245D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v20),((java.lang.Object)v24),((java.lang.Object)v26));
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v27));
    Object v28 = null;
    Object v29 = -11.586569769898245D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = -11.586569769898245D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    ((com.google.javascript.rhino.Node)v30).addChildrenToFront(((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v30));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "++";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v7));
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "++";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "|";
    Object v2 = -18;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "v  ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = false;
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.Node)v8).toString((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v5).setVarArgs((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).toString();
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeChildren();
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJsDocBuilderForNode();
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setOptionalArg((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = -11.586569769898245D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "|";
    Object v2 = -18;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).siblings();
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "++";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = -11.586569769898245D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v5).setVarArgs((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setOptionalArg((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setCharno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeChildren();
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "++";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isUnscopedQualifiedName();
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -11.586569769898245D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = -11.586569769898245D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJsDocBuilderForNode();
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v7));
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 38;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneNode();
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -11.586569769898245D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = -5;
    ((com.google.javascript.rhino.Node)v4).setLineno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = -11.586569769898245D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.rhino.Node)v5).addChildrenToBack(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -11.586569769898245D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = -11.586569769898245D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v7));
    Object v9 = -11.586569769898245D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
