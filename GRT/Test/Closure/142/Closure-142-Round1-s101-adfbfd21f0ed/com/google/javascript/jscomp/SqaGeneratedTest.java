package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 37;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((com.google.javascript.rhino.Node[])v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = null;
    Object v13 = java.util.Comparator.nullsLast(((java.util.Comparator)v12));
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    ((com.google.javascript.rhino.Node)v11).setDirectives(((java.util.Set)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ">";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"f_or(","+"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = ">";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"SymbolTable al\\eady acquired","o",""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ">";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"}","G"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ">";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{" type: ","w,ndow",")"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = -26;
    ((com.google.javascript.rhino.Node)v12).setLineno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).hasScope();
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJsDocBuilderForNode();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ">";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"prototype","setDTate","Y"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    ((com.google.javascript.rhino.Node)v4).detachChildren();
    Object v5 = null;
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = ">";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{")","","J"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).getScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    ((com.google.javascript.rhino.Node)v15).addChildToFront(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).getScope();
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = ">";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 0.0D;
    ((com.google.javascript.rhino.Node)v9).setDouble((((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = ">";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ">";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"prototype","'"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v13).hasScope();
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 58;
    Object v18 = 1;
    ((com.google.javascript.rhino.Node)v16).putIntProp((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = null;
    Object v13 = java.util.Comparator.nullsLast(((java.util.Comparator)v12));
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    ((com.google.javascript.rhino.Node)v11).setDirectives(((java.util.Set)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getScope();
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = 19.5482818650586D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.rhino.Node)v9).addChildrenToBack(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v12).setVarArgs((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = "";
    Object v10 = "suspiciousCode";
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v5).setJSType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v14 = null;
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v15).appendStringTree(((java.lang.Appendable)v16));
    Object v17 = null;
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    ((com.google.javascript.rhino.Node)v18).addChildToFront(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = ">";
    Object v22 = "";
    Object v23 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new java.lang.String[]{};
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.DiagnosticType)v23),((java.lang.String[])v24));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((com.google.javascript.rhino.Node[])v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.rhino.Node)v20).addChildToBack(((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = 19.5482818650586D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    ((com.google.javascript.rhino.Node)v25).detachChildren();
    Object v26 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = 19.5482818650586D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).getEnclosingFunction();
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v22 = ">";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{"setUTCMilli|econds","","b"};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isQualifiedName();
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = ">";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 19.5482818650586D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    ((com.google.javascript.rhino.Node)v17).addChildrenToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 19.5482818650586D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.rhino.Node)v9).addChildToBack(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = 19.5482818650586D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v14).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeChildren();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 19.5482818650586D;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()));
    Object v5 = 19.5482818650586D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).getScope();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = ">";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"NaN","J","4"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 19.5482818650586D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ">";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{"goog.testing.ObjectPropertyString instantiated with invalid argument, qualified name expected. Was \"{0}\".",""};
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v13).makeError(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 19.5482818650586D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 19.5482818650586D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = 19.5482818650586D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 19.5482818650586D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 42;
    ((com.google.javascript.rhino.Node)v10).setLineno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 19.5482818650586D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 19.5482818650586D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 19.5482818650586D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).children();
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 19.5482818650586D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 19.5482818650586D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 19.5482818650586D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = -26;
    Object v17 = true;
    ((com.google.javascript.rhino.Node)v15).putBooleanProp((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = 19.5482818650586D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    ((com.google.javascript.jscomp.CoalesceVariableNames)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }
}
