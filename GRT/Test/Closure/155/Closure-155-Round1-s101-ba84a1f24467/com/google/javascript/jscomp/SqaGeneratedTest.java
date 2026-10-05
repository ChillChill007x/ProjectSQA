package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.Scope)v0).getArgumentsVar();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getParentScope();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).getParentScope();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope.Var)v12).toString();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVars();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v12));
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getRootNode();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).isBottom();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "JSC_CONDITIONAL_IDqGENERATOR_CALL";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = ")X";
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    Object v13 = ((com.google.javascript.jscomp.Scope.Var)v12).hashCode();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "z";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "z";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getVar(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getTypeOfThis();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "p";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "r";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.jscomp.Scope)v5).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "wind6ow";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getOwnSlot(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "Unsupporoted assignment in replaceWithRhs. parent: ";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "G";
    Object v10 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).isBottom();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "Incorrect source mappings order, previous: (%s,%s)\nnew : (%s,%s)\nnode : %s";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v12));
    ((com.google.javascript.jscomp.Scope)v6).undeclare(((com.google.javascript.jscomp.Scope.Var)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getArgumentsVar();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getParent();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVarCount();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "y";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getSlot(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "d";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ": NUL";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    Object v8 = "FAST";
    Object v9 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.AbstractCompiler)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "Eror";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.jscomp.Scope)v5).getSlot(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "&";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getSlot(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).getVars();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getDepth();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVars();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "null";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v6),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "v";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "z";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getVar(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    Object v15 = ((com.google.javascript.jscomp.Scope.Var)v14).hashCode();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getGlobalScope();
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    Object v15 = ((com.google.javascript.jscomp.Scope.Var)v14).hashCode();
    ((com.google.javascript.jscomp.Scope)v6).undeclare(((com.google.javascript.jscomp.Scope.Var)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 28;
    Object v10 = -21;
    Object v11 = -28;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = ((com.google.javascript.jscomp.Scope.Var)v15).hashCode();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = "";
    Object v8 = ((com.google.javascript.jscomp.Scope)v6).getVar(((java.lang.String)v7));
    Object v9 = "'function";
    Object v10 = ((com.google.javascript.jscomp.Scope)v6).getVar(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "q";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getVarCount();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope.Var)v12).hashCode();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVarCount();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    Object v14 = 28;
    Object v15 = -21;
    Object v16 = -28;
    Object v17 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v19));
    ((com.google.javascript.jscomp.Scope)v13).undeclare(((com.google.javascript.jscomp.Scope.Var)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    Object v14 = 28;
    Object v15 = -21;
    Object v16 = -28;
    Object v17 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "";
    ((com.google.javascript.rhino.Node)v17).addSuppression(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "prototype";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getOwnSlot(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v10).isLocal();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getOwnSlot(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v13).getVar(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    Object v14 = "m";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getVar(((java.lang.String)v14));
    Object v16 = 28;
    Object v17 = -21;
    Object v18 = -28;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getArgumentsVar();
    Object v23 = ((com.google.javascript.jscomp.Scope.Var)v22).hashCode();
    ((com.google.javascript.jscomp.Scope)v13).undeclare(((com.google.javascript.jscomp.Scope.Var)v22));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "name";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    Object v8 = "+";
    Object v9 = ((com.google.javascript.jscomp.Scope)v5).getOwnSlot(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).isLocal();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "P";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getVar(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "gog.inherits";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getVar(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = "overrid";
    Object v9 = false;
    Object v10 = ((com.google.javascript.jscomp.Scope)v7).isDeclared(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ": ";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVarCount();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getGlobalScope();
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getRootNode();
    Object v7 = 28;
    Object v8 = -21;
    Object v9 = -28;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v6).addChildToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.AbstractCompiler)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVars();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = 28;
    Object v14 = -21;
    Object v15 = -28;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v12).clonePropsFrom(((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ";";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = "";
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.Scope)v6).isDeclared(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "\"";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getOwnSlot(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "y";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getVar(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ".prototype";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getVar(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getArgumentsVar();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = "Variable {0} first declared in {1}";
    Object v8 = true;
    Object v9 = ((com.google.javascript.jscomp.Scope)v6).isDeclared(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getVars();
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 28;
    Object v9 = -21;
    Object v10 = -28;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getVars();
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v7).undeclare(((com.google.javascript.jscomp.Scope.Var)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getTypeOfThis();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = 28;
    Object v12 = -21;
    Object v13 = -28;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).children();
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getVarCount();
    Object v8 = 28;
    Object v9 = -21;
    Object v10 = -28;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getGlobalScope();
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getGlobalScope();
    Object v16 = ((com.google.javascript.jscomp.Scope)v15).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v6).undeclare(((com.google.javascript.jscomp.Scope.Var)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = "proto";
    Object v9 = false;
    Object v10 = ((com.google.javascript.jscomp.Scope)v7).isDeclared(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "k";
    Object v7 = true;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 28;
    Object v10 = -21;
    Object v11 = -28;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getGlobalScope();
    Object v16 = ((com.google.javascript.jscomp.Scope)v15).getGlobalScope();
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getArgumentsVar();
    Object v18 = ((com.google.javascript.jscomp.Scope.Var)v17).hashCode();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v8 = "A";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getVar(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getVar(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = "|boolean";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getParent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = "...";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).isGlobal();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 28;
    Object v11 = -21;
    Object v12 = -28;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVars();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 28;
    Object v1 = -21;
    Object v2 = -28;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = 28;
    Object v7 = -21;
    Object v8 = -28;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getGlobalScope();
    org.junit.Assert.assertNotNull(v14);
  }
}
