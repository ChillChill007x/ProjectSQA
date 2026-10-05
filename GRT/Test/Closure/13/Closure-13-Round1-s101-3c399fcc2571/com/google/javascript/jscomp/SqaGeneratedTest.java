package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isVarArgs();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setVarArgs((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getQualifiedName();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v18).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).visit(((com.google.javascript.rhino.Node)v18));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).visit(((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ((com.google.javascript.jscomp.AbstractCompiler)v6).getErrorManager();
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ((com.google.javascript.jscomp.AbstractCompiler)v6).getErrorManager();
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).visit(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ((com.google.javascript.jscomp.AbstractCompiler)v6).getErrorManager();
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).visit(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).visit(((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).getDirectives();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).visit(((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).setSourceEncodedPosition((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setIsSyntheticBlock((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v9).addChildToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v12).addChildToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeChildren();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getDouble();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isFromExterns();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ((com.google.javascript.jscomp.AbstractCompiler)v6).getErrorManager();
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 36;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getAncestor((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).visit(((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).wasEmptyNode();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ((com.google.javascript.jscomp.AbstractCompiler)v6).getErrorManager();
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).getCompiler();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ".prototype.";
    Object v8 = -28;
    Object v9 = ((com.google.javascript.jscomp.SourceExcerptProvider)v6).getSourceRegion(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v6).reportCodeChange();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).removeFirstChild();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ".prototype.";
    Object v8 = -28;
    Object v9 = ((com.google.javascript.jscomp.SourceExcerptProvider)v6).getSourceRegion(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1.0D;
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v6).reportCodeChange();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).visit(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v6).reportCodeChange();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = 1.0D;
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1.0D;
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 1.0D;
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).visit(((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = ".prototype.";
    Object v8 = -28;
    Object v9 = ((com.google.javascript.jscomp.SourceExcerptProvider)v6).getSourceRegion(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setVarArgs((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setWasEmptyNode((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isQualifiedName();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isSyntheticBlock();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).wasEmptyNode();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "null";
    Object v8 = new java.io.File(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v8));
    ((com.google.javascript.rhino.Node)v6).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v9));
    Object v10 = null;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v6).reportCodeChange();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v9 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v8));
    Object v10 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v9).getCompiler();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getSourceOffset();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 23;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1.0D;
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getAncestor((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 4;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getAncestor((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v12).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "JSC_CONDITIONAL_ID_GENERATOR_CALL";
    ((com.google.javascript.rhino.Node)v12).addSuppression(((java.lang.String)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getStaticSourceFile();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "}";
    Object v17 = new com.google.javascript.rhino.InputId(((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v15).setInputId(((com.google.javascript.rhino.InputId)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = 1.0D;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).siblings();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).visit(((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).cloneTree();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isVarArgs();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPositionForTree((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ")";
    Object v11 = 0;
    Object v12 = ((com.google.javascript.jscomp.SourceExcerptProvider)v9).getSourceRegion(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isSyntheticBlock();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).visit(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ")";
    Object v11 = 0;
    Object v12 = ((com.google.javascript.jscomp.SourceExcerptProvider)v9).getSourceRegion(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).visit(((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ")";
    Object v11 = 0;
    Object v12 = ((com.google.javascript.jscomp.SourceExcerptProvider)v9).getSourceRegion(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 1.0D;
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = 1.0D;
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).visit(((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ")";
    Object v11 = 0;
    Object v12 = ((com.google.javascript.jscomp.SourceExcerptProvider)v9).getSourceRegion(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v14 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v13));
    Object v15 = 1.0D;
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).getDouble();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v14).visit(((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getProgress();
    Object v11 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v12 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v11 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v10));
    Object v12 = 1.0D;
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v11).visit(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getProgress();
    Object v11 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v12 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v11));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v12).visit(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getStaticSourceFile();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getProgress();
    Object v11 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v12 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v11));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = -4;
    Object v18 = ((com.google.javascript.rhino.Node)v16).getIntProp((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v12).visit(((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "}";
    Object v14 = new com.google.javascript.rhino.InputId(((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v12).setInputId(((com.google.javascript.rhino.InputId)v14));
    Object v15 = null;
    Object v16 = 1.0D;
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null};
    Object v5 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v4));
    Object v6 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v5).getCompiler();
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).visit(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{};
    Object v2 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v1));
    Object v3 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v2).getCompiler();
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null,null};
    Object v8 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v7));
    Object v9 = ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v8).getCompiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getProgress();
    Object v11 = new com.google.javascript.jscomp.AbstractPeepholeOptimization[]{null,null};
    Object v12 = new com.google.javascript.jscomp.PeepholeOptimizationsPass(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.AbstractPeepholeOptimization[])v11));
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 1.0D;
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v16).addChildToFront(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.PeepholeOptimizationsPass)v12).visit(((com.google.javascript.rhino.Node)v16));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
