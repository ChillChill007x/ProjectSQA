package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 13.730385926634657D;
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).removeFirstChild();
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v10));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v0).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.SimpleDefinitionFinder)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isFromExterns();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 29;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getBooleanProp((((java.lang.Integer)v10).intValue()));
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).isVarArgs();
    Object v22 = 13.730385926634657D;
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getLength();
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v27));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.SimpleDefinitionFinder)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 13.730385926634657D;
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.rhino.Node)v24).addChildToFront(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = ((com.google.javascript.jscomp.SimpleDefinitionFinder)v31).getDefinitionSites();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.SimpleDefinitionFinder)v31));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = 13.730385926634657D;
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.SimpleDefinitionFinder)v15).getDefinitionsReferencedAt(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -11;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = 13.730385926634657D;
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 13.730385926634657D;
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.SimpleDefinitionFinder)v15).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -6;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getProp((((java.lang.Integer)v10).intValue()));
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 15;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getProp((((java.lang.Integer)v10).intValue()));
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 13.730385926634657D;
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v24).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v30));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.SimpleDefinitionFinder)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -12;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getIntProp((((java.lang.Integer)v10).intValue()));
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 27;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getIntProp((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -6;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPositionForTree((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getAncestors();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v17));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "runCustomPasses";
    ((com.google.javascript.rhino.Node)v20).addSuppression(((java.lang.String)v21));
    Object v22 = null;
    Object v23 = 13.730385926634657D;
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v27));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.SimpleDefinitionFinder)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).isOnlyModifiesThisCall();
    Object v22 = 13.730385926634657D;
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).isEquivalentToTyped(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 13.730385926634657D;
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v18).copyInformationFromForTree(((com.google.javascript.rhino.Node)v22));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFrom(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = ((com.google.javascript.jscomp.SimpleDefinitionFinder)v15).getDefinitionSites();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setIsSyntheticBlock((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getDirectives();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v17));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isLocalResultCall();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "j";
    ((com.google.javascript.rhino.Node)v9).setSourceFileForTesting(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPosition((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.Compiler();
    Object v26 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v25));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.SimpleDefinitionFinder)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = false;
    ((com.google.javascript.rhino.Node)v20).setIsSyntheticBlock((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = 13.730385926634657D;
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getAncestors();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isNoSideEffectsCall();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).clonePropsFrom(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v24).appendStringTree(((java.lang.Appendable)v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "Graph initalized with edge annotations turned off";
    ((com.google.javascript.rhino.Node)v24).setSourceFileForTesting(((java.lang.String)v25));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v27));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.SimpleDefinitionFinder)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getQualifiedName();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "$$";
    Object v22 = new com.google.javascript.rhino.InputId(((java.lang.String)v21));
    ((com.google.javascript.rhino.Node)v20).setInputId(((com.google.javascript.rhino.InputId)v22));
    Object v23 = null;
    Object v24 = 13.730385926634657D;
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.SimpleDefinitionFinder)v20).getDefinitionsReferencedAt(((com.google.javascript.rhino.Node)v24));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v13).putBooleanProp((((java.lang.Integer)v14).intValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildrenToBack(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildToFront(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).srcref(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).toString();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v9).addChildrenToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v18).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = ((com.google.javascript.jscomp.SimpleDefinitionFinder)v22).getDefinitionSites();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.SimpleDefinitionFinder)v22));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJsDocBuilderForNode();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -6;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 13.730385926634657D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v17));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.SimpleDefinitionFinder)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).getSourceFileName();
    Object v22 = 13.730385926634657D;
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getDirectives();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).srcrefTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 13.730385926634657D;
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.SimpleDefinitionFinder)v20).process(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 37.679187923861434D;
    ((com.google.javascript.rhino.Node)v20).setDouble((((java.lang.Double)v21).doubleValue()));
    Object v22 = null;
    Object v23 = 13.730385926634657D;
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setOptionalArg((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 1;
    Object v26 = ((com.google.javascript.rhino.Node)v24).getProp((((java.lang.Integer)v25).intValue()));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v27));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.SimpleDefinitionFinder)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    ((com.google.javascript.rhino.Node)v9).setLineno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 46;
    ((com.google.javascript.rhino.Node)v13).setSourceEncodedPosition((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).toString();
    Object v22 = 13.730385926634657D;
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isLocalResultCall();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setVarArgs((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getDirectives();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 54;
    Object v11 = -13;
    ((com.google.javascript.rhino.Node)v9).putIntProp((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 13.730385926634657D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v9).setIsSyntheticBlock((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = true;
    ((com.google.javascript.rhino.Node)v20).setOptionalArg((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = 13.730385926634657D;
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = 13.730385926634657D;
    Object v30 = 1;
    Object v31 = 1;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = 13.730385926634657D;
    Object v34 = 1;
    Object v35 = 1;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.SimpleDefinitionFinder)v28).process(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.SimpleDefinitionFinder)v28));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v13).setLineno((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).removeFirstChild();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).toString();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.SimpleDefinitionFinder)v16).getDefinitionsReferencedAt(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getDouble();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 36;
    Object v26 = 1;
    ((com.google.javascript.rhino.Node)v24).putIntProp((((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 13.730385926634657D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).isEquivalentTo(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).srcrefTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v19));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.SimpleDefinitionFinder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).copyInformationFromForTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isVarArgs();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getStaticSourceFile();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 0;
    ((com.google.javascript.rhino.Node)v24).setSourceEncodedPosition((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v27));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.SimpleDefinitionFinder)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getInputId();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeFirstChild();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isFromExterns();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPositionForTree((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).isEquivalentToTyped(((com.google.javascript.rhino.Node)v13));
    Object v15 = 13.730385926634657D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setLength((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 13.730385926634657D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v15).detachChildren();
    Object v16 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v14));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v15));
    Object v16 = null;
    Object v17 = 13.730385926634657D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 13.730385926634657D;
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v20).copyInformationFrom(((com.google.javascript.rhino.Node)v24));
    Object v26 = 13.730385926634657D;
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v13).setLineno((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = 13.730385926634657D;
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 13.730385926634657D;
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.SimpleDefinitionFinder)v17).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.SimpleDefinitionFinder)v17));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 13.730385926634657D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getLength();
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.RemoveUnusedVars(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13.730385926634657D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getStaticSourceFile();
    Object v11 = 13.730385926634657D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SimpleDefinitionFinder(((com.google.javascript.jscomp.AbstractCompiler)v15));
    ((com.google.javascript.jscomp.RemoveUnusedVars)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.SimpleDefinitionFinder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }
}
