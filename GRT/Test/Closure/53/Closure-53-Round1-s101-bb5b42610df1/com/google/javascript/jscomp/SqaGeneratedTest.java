package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isFromExterns();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getStaticSourceFile();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v5).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = -9;
    ((com.google.javascript.rhino.Node)v8).removeProp((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeFirstChild();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getJsDocBuilderForNode();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v8).addChildToFront(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneTree();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSideEffectFlags();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeFirstChild();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "na;mes";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "na;mes";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).removeChildren();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 0;
    ((com.google.javascript.rhino.Node)v5).putIntProp((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isNoSideEffectsCall();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "na;mes";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v11).setQuotedString();
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJSDocInfo();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJSDocInfo();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSourceFileName();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 59;
    Object v14 = "TUE";
    Object v15 = "k";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v12).putProp((((java.lang.Integer)v13).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isVarArgs();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isVarArgs();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 42;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getProp((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSourceFileName();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeChildren();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "na;mes";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v8).useSourceInfoFrom(((com.google.javascript.rhino.Node)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isLocalResultCall();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isQualifiedName();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "na;mes";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = 50;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSourceFileName();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setOptionalArg((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isOptionalArg();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isVarArgs();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = -38;
    ((com.google.javascript.rhino.Node)v9).setType((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSourceOffset();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v8).setIsSyntheticBlock((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -13;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = true;
    ((com.google.javascript.rhino.Node)v11).setVarArgs((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = -13;
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v6).putBooleanProp((((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "prototyp'e";
    ((com.google.javascript.rhino.Node)v7).setString(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSideEffectFlags();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v7).clonePropsFrom(((com.google.javascript.rhino.Node)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "7";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -13;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getStaticSourceFile();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.rhino.Node)v10).addChildToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = -15;
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v7).setQuotedString();
    Object v8 = null;
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v7).addChildrenToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isUnscopedQualifiedName();
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setOptionalArg((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getAncestors();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = -21;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "";
    Object v10 = -13;
    Object v11 = ((com.google.javascript.jscomp.SourceExcerptProvider)v8).getSourceLine(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v13 = ((com.google.common.base.Supplier)v12).get();
    Object v14 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.common.base.Supplier)v12));
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = "H";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -13;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isQualifiedName();
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isOnlyModifiesThisCall();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -13;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).hasSideEffects();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = "TUE";
    Object v12 = "k";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.rhino.Node)v9).putProp((((java.lang.Integer)v10).intValue()),((java.lang.Object)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getStaticSourceFile();
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getAncestor((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).toString();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "na;mes";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v11).addChildToBack(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSideEffectFlags();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSourceFileName();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getAncestor((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -13;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = 1;
    Object v15 = "H";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).copyInformationFromForTree(((com.google.javascript.rhino.Node)v13));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).copyInformationFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v13).setSourceEncodedPositionForTree((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v11).setQuotedString();
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v8).isEquivalentToTyped(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = -20;
    Object v12 = -22;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
