package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSourceFileName();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = 7;
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = -11;
    Object v11 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    ((com.google.javascript.rhino.Node)v9).putProp((((java.lang.Integer)v10).intValue()),((java.lang.Object)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).copyInformationFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isOptionalArg();
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isVarArgs();
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = -17;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPositionForTree((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v7).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = "duplicat";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v7).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v8));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "arguments";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v5).detachChildren();
    Object v6 = null;
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).wasEmptyNode();
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getProp((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).children();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getBooleanProp((((java.lang.Integer)v5).intValue()));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -54;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).isEquivalentTo(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setIsSyntheticBlock((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = false;
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.Node)v7).toString((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "duplicat";
    Object v13 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = 25;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneNode();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
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
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = 14;
    ((com.google.javascript.rhino.Node)v9).removeProp((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
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
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "|";
    Object v2 = -2;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "|";
    Object v2 = -2;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = "duplicat";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v10).addChildToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = " -B ";
    ((com.google.javascript.rhino.Node)v9).setSourceFileForTesting(((java.lang.String)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "|";
    Object v2 = -2;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isFromExterns();
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v8).addChildToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).srcrefTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getIntProp((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
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
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isOnlyModifiesThisCall();
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v7).srcref(((com.google.javascript.rhino.Node)v9));
    Object v11 = "duplicat";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = "duplicat";
    Object v13 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v11).srcrefTree(((com.google.javascript.rhino.Node)v13));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = 18;
    ((com.google.javascript.rhino.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v4).addChildToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isSyntheticBlock();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
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
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v6).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneTree();
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "(";
    Object v8 = "(";
    Object v9 = "V";
    Object v10 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v6).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v10));
    Object v11 = null;
    Object v12 = "duplicat";
    Object v13 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getStaticSourceFile();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).isEquivalentTo(((com.google.javascript.rhino.Node)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "duplicat";
    Object v4 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).children();
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeFirstChild();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getString();
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?";
    Object v2 = -5;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isNoSideEffectsCall();
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "auRthor";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
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
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJSDocInfo();
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
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
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toString();
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "|";
    Object v2 = -2;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = ((com.google.common.base.Supplier)v4).get();
    Object v6 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = "duplicat";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).checkTreeEquals(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v5).setQuotedString();
    Object v6 = null;
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isUnscopedQualifiedName();
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "THROWJ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = 15;
    ((com.google.javascript.rhino.Node)v8).setSourceEncodedPosition((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "THROWJ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v5).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "public";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = -22;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPositionForTree((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v7).appendStringTree(((java.lang.Appendable)v8));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v11).setSourceEncodedPositionForTree((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.google.javascript.rhino.InputId(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v6).setInputId(((com.google.javascript.rhino.InputId)v8));
    Object v9 = null;
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = -15;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getProp((((java.lang.Integer)v8).intValue()));
    Object v10 = "duplicat";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "THROWJ";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isUnscopedQualifiedName();
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "public";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "duplicat";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = 3;
    ((com.google.javascript.rhino.Node)v8).setLength((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v7).detachChildren();
    Object v8 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = ((com.google.common.base.Supplier)v2).get();
    Object v4 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v5 = "duplicat";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = "duplicat";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = -37;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getBooleanProp((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "public";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "duplicat";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v7).addChildrenToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = "duplicat";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    ((com.google.javascript.jscomp.InlineObjectLiterals)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v3 = new com.google.javascript.jscomp.InlineObjectLiterals(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2));
    Object v4 = "duplicat";
    Object v5 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v4));
    Object v6 = "duplicat";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineObjectLiterals)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
