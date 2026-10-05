package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 37;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v4).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = "source";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"parseInputs"};
    ((com.google.javascript.jscomp.NodeTraversal)v7).report(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v14 = null;
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getEnclosingFunction();
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.rhino.Node)v11).addChildAfter(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).toString();
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1;
    Object v13 = "source";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v11).putProp((((java.lang.Integer)v12).intValue()),((java.lang.Object)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = "source";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = "source";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v17),((java.lang.Object)v19));
    ((com.google.javascript.rhino.Node)v9).setDirectives(((java.util.Set)v20));
    Object v21 = null;
    Object v22 = 19.5482818650586D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.rhino.Node)v12).copyInformationFrom(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = "source";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"call"};
    ((com.google.javascript.jscomp.NodeTraversal)v7).report(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v14 = null;
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverseRoots(((java.util.List)v8));
    Object v9 = null;
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v9).detachChildren();
    Object v10 = null;
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.rhino.Node)v19).copyInformationFromForTree(((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = 19.5482818650586D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).hasScope();
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).toStringTree();
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).hasSideEffects();
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 42;
    ((com.google.javascript.rhino.Node)v14).setType((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeFirstChild();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 5;
    ((com.google.javascript.rhino.Node)v12).setType((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).siblings();
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    Object v23 = -15;
    Object v24 = true;
    ((com.google.javascript.rhino.Node)v22).putBooleanProp((((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = "source";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = "source";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v14));
    ((com.google.javascript.rhino.Node)v4).setDirectives(((java.util.Set)v15));
    Object v16 = null;
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).cloneNode();
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.rhino.Node)v11).addChildToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = -54;
    ((com.google.javascript.rhino.Node)v11).setType((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 7;
    ((com.google.javascript.rhino.Node)v12).setLineno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v4).appendStringTree(((java.lang.Appendable)v5));
    Object v6 = null;
    Object v7 = 19.5482818650586D;
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
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isQualifiedName();
    Object v13 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = "source";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "source";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v19),((java.lang.Object)v21));
    ((com.google.javascript.rhino.Node)v11).setDirectives(((java.util.Set)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getScope();
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = 19.5482818650586D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).siblings();
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.rhino.Node)v19).addChildrenToBack(((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = 19.5482818650586D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = "msg.no.brackQet.arg";
    Object v15 = "";
    Object v16 = 45;
    Object v17 = 50;
    Object v18 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.rhino.Node)v11).setJSType(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = "source";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"L","setMilliseconds",""};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.rhino.Node)v17).addChildAfter(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = 19.5482818650586D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v21).appendStringTree(((java.lang.Appendable)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = "source";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"F","","/"};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getAncestors();
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v13));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getScope();
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 62;
    Object v22 = -41;
    ((com.google.javascript.rhino.Node)v20).putIntProp((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = 19.5482818650586D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneNode();
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.Normalize)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setWasEmptyNode((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.rhino.Node)v15).addChildAfter(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((java.util.List)v9));
    Object v10 = null;
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isQualifiedName();
    Object v16 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getDouble();
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
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
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).toString();
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setOptionalArg((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = 19.5482818650586D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    ((com.google.javascript.rhino.Node)v21).addChildToBack(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).getAncestors();
    Object v22 = 19.5482818650586D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = "source";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{""};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = "source";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{")"};
    ((com.google.javascript.jscomp.NodeTraversal)v7).report(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v14 = null;
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toStringTree();
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).siblings();
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 58;
    ((com.google.javascript.rhino.Node)v10).setType((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setIsSyntheticBlock((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getQualifiedName();
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setIsSyntheticBlock((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isQualifiedName();
    ((com.google.javascript.jscomp.Normalize)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v10).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v18).traverse(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    Object v22 = 19.5482818650586D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = 19.5482818650586D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 0;
    ((com.google.javascript.rhino.Node)v20).setType((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = 19.5482818650586D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = "msg.no.brackQet.arg";
    Object v28 = "";
    Object v29 = 45;
    Object v30 = 50;
    Object v31 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),((java.lang.String)v27),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    ((com.google.javascript.rhino.Node)v24).setJSType(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v32 = null;
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 1;
    ((com.google.javascript.rhino.Node)v10).setType((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).hasSideEffects();
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).toStringTree();
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.Normalize)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.Normalize)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }
}
