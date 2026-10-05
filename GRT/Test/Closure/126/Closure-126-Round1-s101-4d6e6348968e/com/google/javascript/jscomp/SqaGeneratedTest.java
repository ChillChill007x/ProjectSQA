package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeFirstChild();
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 2;
    Object v5 = "this";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v12 = 13;
    Object v13 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 20;
    Object v5 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getDirectives();
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = -11.370898207980996D;
    ((com.google.javascript.rhino.Node)v18).setDouble((((java.lang.Double)v19).doubleValue()));
    Object v20 = null;
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 0.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v17),((java.lang.Object)v19));
    ((com.google.javascript.rhino.Node)v9).setDirectives(((java.util.Set)v20));
    Object v21 = null;
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = ">";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -42;
    Object v5 = "']";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 1;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getIntProp((((java.lang.Integer)v13).intValue()));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -28;
    Object v5 = "Q";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverse(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).getLength();
    Object v5 = 26;
    Object v6 = "\"";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getChangeTime();
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = ".";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 12;
    Object v5 = ",";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isSyntheticBlock();
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = "null";
    ((com.google.javascript.rhino.Node)v11).addSuppression(((java.lang.String)v12));
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = ".";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "k";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -11;
    Object v5 = "u";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = "valueOf";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "";
    Object v18 = "\n";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new java.lang.String[]{"","n",">"};
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v14).makeError(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.DiagnosticType)v19),((java.lang.String[])v20));
    Object v22 = 0.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = 0.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = -2;
    Object v14 = "{0} @extends non-objeclt type {1}";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0;
    Object v10 = "Q";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = ":helper";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = -20;
    Object v10 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = "k";
    Object v5 = new com.google.javascript.rhino.InputId(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v3).setInputId(((com.google.javascript.rhino.InputId)v5));
    Object v6 = null;
    Object v7 = -11;
    Object v8 = "Expected ";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -38;
    Object v5 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 3;
    Object v5 = "boolean";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "%";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "H";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1;
    Object v7 = "";
    Object v8 = "\n";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v7),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v5).putProp((((java.lang.Integer)v6).intValue()),((java.lang.Object)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).hasScope();
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 0.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "!";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -42;
    Object v5 = "1left operand";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 7;
    Object v10 = "Object";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = -5;
    ((com.google.javascript.rhino.Node)v9).setLineno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = 87;
    Object v20 = true;
    ((com.google.javascript.rhino.Node)v18).putBooleanProp((((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 22;
    Object v5 = "n";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 39;
    Object v10 = "in";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).getEnclosingFunction();
    Object v12 = 0.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -18;
    Object v5 = "Cannot parsB value of message ";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = true;
    ((com.google.javascript.rhino.Node)v3).setOptionalArg((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = "\n";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -12;
    ((com.google.javascript.rhino.Node)v7).setChangeTime((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = -24;
    Object v14 = ";";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -9;
    Object v5 = ">";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).isEquivalentToShallow(((com.google.javascript.rhino.Node)v14));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -2;
    Object v5 = "-";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = "w";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -19;
    Object v5 = "me";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -26;
    Object v5 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "";
    Object v10 = "\n";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"a",", ","stri"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = "Non-strip type {0} cannot inheri3t from strip type {1}";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -38;
    Object v5 = "module";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "I";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "$";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 7;
    Object v5 = "w";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 46;
    Object v5 = "prototype";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPositionForTree((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 8;
    Object v5 = "]8";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 2;
    ((com.google.javascript.rhino.Node)v3).setSourceEncodedPositionForTree((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = "arguments";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getDirectives();
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 63;
    Object v5 = "}";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1;
    Object v10 = ":";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -81;
    ((com.google.javascript.rhino.Node)v3).setCharno((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = "v";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = "JSCompiler_renameProperty";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isFromExterns();
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = -36;
    Object v10 = "functon";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = "";
    Object v10 = "\n";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = 0.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = -36;
    Object v19 = "";
    Object v20 = "\n";
    Object v21 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.rhino.Node)v17).putProp((((java.lang.Integer)v18).intValue()),((java.lang.Object)v21));
    Object v22 = null;
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverse(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 32;
    ((com.google.javascript.rhino.Node)v10).setLineno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -9;
    Object v5 = "BO";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "";
    Object v9 = "\n";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"!--","prototy{e"};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "Function {0}: called with {1} argument(s).N Function requires at least {2} argument(s){3}.";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = -54;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getBooleanProp((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = "prstotype";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 0.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = "bo;olean";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v14).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.Node)v3).toString((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -25;
    Object v9 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = "x\n";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = -18;
    Object v5 = "H";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = 0.0D;
    Object v3 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v2).doubleValue()));
    Object v4 = 9;
    Object v5 = "";
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).tryMinimizeExits(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPositionForTree((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.MinimizeExitPoints(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 0.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverse(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 0.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = "";
    ((com.google.javascript.rhino.Node)v10).setSourceFileForTesting(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.MinimizeExitPoints)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }
}
