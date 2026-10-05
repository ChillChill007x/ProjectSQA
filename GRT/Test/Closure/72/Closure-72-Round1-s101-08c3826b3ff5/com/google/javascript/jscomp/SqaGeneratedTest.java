package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 2;
    Object v6 = -9;
    Object v7 = 14;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 2;
    Object v10 = -9;
    Object v11 = 14;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = -9;
    Object v20 = 14;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v17).copyInformationFromForTree(((com.google.javascript.rhino.Node)v21));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v4).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = -9;
    Object v18 = 14;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 2;
    Object v21 = -9;
    Object v22 = 14;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = -9;
    Object v18 = 14;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 2;
    Object v21 = -9;
    Object v22 = 14;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.rhino.Node)v19).addChildToFront(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = 2;
    Object v26 = -9;
    Object v27 = 14;
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "5valueOf";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 2;
    Object v6 = -9;
    Object v7 = 14;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 2;
    Object v10 = -9;
    Object v11 = 14;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = -9;
    Object v20 = 14;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v4).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).removeFirstChild();
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 2;
    Object v6 = -9;
    Object v7 = 14;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 2;
    Object v10 = -9;
    Object v11 = 14;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = -9;
    Object v18 = 14;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 2;
    Object v21 = -9;
    Object v22 = 14;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v13));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "5valueOf";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v20).clonePropsFrom(((com.google.javascript.rhino.Node)v24));
    Object v26 = 2;
    Object v27 = -9;
    Object v28 = 14;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.rhino.Node)v22).addChildToBack(((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).toString();
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getQualifiedName();
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v12));
    Object v13 = null;
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 7;
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v10).putBooleanProp((((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v16).addChildrenToBack(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "5valueOf";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v15));
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ":";
    Object v5 = -41;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "Q";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "Q";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = ((com.google.common.base.Supplier)v5).get();
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).toStringTree();
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = ((com.google.common.base.Supplier)v11).get();
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = -9;
    Object v20 = 14;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).siblings();
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).hasSideEffects();
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeChildren();
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = -22;
    ((com.google.javascript.rhino.Node)v24).setCharno((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "5valueOf";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "5valueOf";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.rhino.Node)v11).detachChildren();
    Object v12 = null;
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).removeChildren();
    Object v20 = 2;
    Object v21 = -9;
    Object v22 = 14;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.rhino.Node)v18).addChildrenToBack(((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = -9;
    Object v26 = 14;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v12));
    Object v13 = null;
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 30;
    ((com.google.javascript.rhino.Node)v20).setType((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 0;
    ((com.google.javascript.rhino.Node)v26).setLineno((((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).removeChildren();
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "Q";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "3";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = ((com.google.common.base.Supplier)v11).get();
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v14).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = -9;
    Object v26 = 14;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 2;
    Object v29 = -9;
    Object v30 = 14;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = 2;
    Object v33 = -9;
    Object v34 = 14;
    Object v35 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.rhino.Node)v31).copyInformationFrom(((com.google.javascript.rhino.Node)v35));
    ((com.google.javascript.jscomp.RenameLabels)v14).process(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v31));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -12;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = ((com.google.common.base.Supplier)v7).get();
    Object v9 = false;
    Object v10 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "): globalSets=";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = ((com.google.common.base.Supplier)v11).get();
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v14).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = -9;
    Object v26 = 14;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 2;
    Object v29 = -9;
    Object v30 = 14;
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v14).process(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = -9;
    Object v20 = 14;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).cloneTree();
    ((com.google.javascript.jscomp.RenameLabels)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "U";
    Object v5 = -16;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = 0;
    ((com.google.javascript.rhino.Node)v9).putIntProp((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).siblings();
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "): globalSets=";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v14).setIsSyntheticBlock((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = ((com.google.common.base.Supplier)v11).get();
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v14).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "): globalSets=";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    ((com.google.javascript.rhino.Node)v20).setLineno((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "3";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isUnscopedQualifiedName();
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "5valueOf";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ":";
    Object v5 = -41;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = ((com.google.common.base.Supplier)v5).get();
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 2;
    Object v10 = -9;
    Object v11 = 14;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 2;
    Object v14 = -9;
    Object v15 = 14;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "3";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).hasSideEffects();
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v18 = ")";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v16),((com.google.javascript.jscomp.CheckLevel)v17),((java.lang.String)v18));
    Object v20 = new java.lang.String[]{};
    Object v21 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v19),((java.lang.String[])v20));
    Object v22 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v21));
    ((com.google.javascript.rhino.Node)v11).setDirectives(((java.util.Set)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = -9;
    Object v26 = 14;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).removeChildren();
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "U";
    Object v5 = -16;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -12;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = ((com.google.common.base.Supplier)v7).get();
    Object v9 = false;
    Object v10 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v10).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).clonePropsFrom(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ":";
    Object v5 = -41;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "3";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -12;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = ((com.google.common.base.Supplier)v7).get();
    Object v9 = false;
    Object v10 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v10).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = 2;
    Object v21 = -9;
    Object v22 = 14;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 2;
    Object v25 = -9;
    Object v26 = 14;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v10).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getAncestor((((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = -9;
    Object v20 = 14;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).removeChildren();
    ((com.google.javascript.jscomp.RenameLabels)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "U";
    Object v5 = -16;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).cloneNode();
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 2;
    Object v6 = -9;
    Object v7 = 14;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).children();
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v13).isEquivalentToTyped(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.RenameLabels)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = -9;
    Object v20 = 14;
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v13).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 2;
    Object v28 = -9;
    Object v29 = 14;
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v30).children();
    ((com.google.javascript.jscomp.RenameLabels)v13).process(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 2;
    Object v8 = -9;
    Object v9 = 14;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v14));
    Object v16 = 2;
    Object v17 = -9;
    Object v18 = 14;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "{";
    ((com.google.javascript.rhino.Node)v19).addSuppression(((java.lang.String)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.RenameLabels)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = ")";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v12 = ((com.google.common.base.Supplier)v11).get();
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.rhino.Node)v22).addChildToFront(((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    ((com.google.javascript.jscomp.RenameLabels)v14).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "U";
    Object v5 = -16;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 2;
    Object v15 = -9;
    Object v16 = 14;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = true;
    ((com.google.javascript.rhino.Node)v26).setVarArgs((((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "U";
    Object v5 = -16;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setWasEmptyNode((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = -9;
    Object v18 = 14;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v9).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = 1;
    ((com.google.javascript.rhino.Node)v15).putIntProp((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "): globalSets=";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 2;
    Object v17 = -9;
    Object v18 = 14;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildAfter(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    Object v21 = 2;
    Object v22 = -9;
    Object v23 = 14;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "Q";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 2;
    Object v9 = -9;
    Object v10 = 14;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = -9;
    Object v14 = 14;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 2;
    Object v18 = -9;
    Object v19 = 14;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -12;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v8 = ((com.google.common.base.Supplier)v7).get();
    Object v9 = false;
    Object v10 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.common.base.Supplier)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 2;
    Object v12 = -9;
    Object v13 = 14;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = -16;
    ((com.google.javascript.rhino.Node)v18).removeProp((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    ((com.google.javascript.jscomp.RenameLabels)v10).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 2;
    Object v16 = -9;
    Object v17 = 14;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    Object v20 = -9;
    Object v21 = 14;
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 2;
    Object v24 = -9;
    Object v25 = 14;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 2;
    Object v28 = -9;
    Object v29 = 14;
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    ((com.google.javascript.rhino.Node)v22).addChildAfter(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "boolLan";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.RenameLabels(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 2;
    Object v7 = -9;
    Object v8 = 14;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = -9;
    Object v12 = 14;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RenameLabels)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }
}
