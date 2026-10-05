package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = 9;
    Object v4 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v0).hotSwapScript(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getSourceFileName();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isLocalResultCall();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getStaticSourceFile();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = -7;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getSourceOffset();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = 9;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v14).clonePropsFrom(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeFirstChild();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPosition((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getAncestors();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).checkTreeEquals(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = "duplicate";
    Object v16 = "";
    Object v17 = java.io.InputStream.nullInputStream();
    Object v18 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v15),((java.lang.String)v16),((java.io.InputStream)v17));
    ((com.google.javascript.rhino.Node)v14).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).children();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneNode();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).siblings();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v9).appendStringTree(((java.lang.Appendable)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getStaticSourceFile();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setWasEmptyNode((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).srcref(((com.google.javascript.rhino.Node)v14));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = 9;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v17).copyInformationFromForTree(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 48;
    Object v14 = "/** Begin line maps. **/";
    Object v15 = new com.google.javascript.rhino.InputId(((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).putProp((((java.lang.Integer)v13).intValue()),((java.lang.Object)v15));
    Object v16 = null;
    Object v17 = 9;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()));
    Object v19 = 9;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v18).useSourceInfoFrom(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v18));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getSourceOffset();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 4;
    ((com.google.javascript.rhino.Node)v12).setType((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = 9;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).srcrefTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = " -B ";
    ((com.google.javascript.rhino.Node)v12).setSourceFileForTesting(((java.lang.String)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isFromExterns();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeChildren();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v9).srcrefTree(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = -25;
    ((com.google.javascript.rhino.Node)v14).setCharno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).toStringTree();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPosition((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).isEquivalentToTyped(((com.google.javascript.rhino.Node)v14));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).cloneNode();
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    ((com.google.javascript.rhino.Node)v9).removeProp((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getStaticSourceFile();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).toString();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getSourceOffset();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isLocalResultCall();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isFromExterns();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getJSDocInfo();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = false;
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.Node)v7).toString((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 9;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 22;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getIntProp((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getBooleanProp((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v7).appendStringTree(((java.lang.Appendable)v8));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).checkTreeEquals(((com.google.javascript.rhino.Node)v14));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isSyntheticBlock();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getAncestors();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).toStringTree();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = -8;
    ((com.google.javascript.rhino.Node)v7).setCharno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = -35;
    ((com.google.javascript.rhino.Node)v9).removeProp((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getJsDocBuilderForNode();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "Function";
    ((com.google.javascript.rhino.Node)v9).setSourceFileForTesting(((java.lang.String)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getSourceFileName();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isQualifiedName();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v12).addChildToBack(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    Object v12 = 9;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).isEquivalentTo(((com.google.javascript.rhino.Node)v14));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).removeFirstChild();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getStaticSourceFile();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isQualifiedName();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getBooleanProp((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = -20;
    Object v13 = ((com.google.javascript.rhino.Node)v11).getProp((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getStaticSourceFile();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).siblings();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v9).setIsSyntheticBlock((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = java.util.function.Function.identity();
    Object v16 = java.util.Comparator.comparing(((java.util.function.Function)v15));
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    ((com.google.javascript.rhino.Node)v14).setDirectives(((java.util.Set)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setWasEmptyNode((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isVarArgs();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = false;
    Object v12 = false;
    Object v13 = ((com.google.javascript.rhino.Node)v9).toString((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = false;
    Object v16 = false;
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.Node)v14).toString((((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).toString();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getSourceOffset();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getJsDocBuilderForNode();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    Object v14 = 9;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isSyntheticBlock();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isVarArgs();
    Object v9 = 9;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "/** Begin line maps. **/";
    Object v11 = new com.google.javascript.rhino.InputId(((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v9).setInputId(((com.google.javascript.rhino.InputId)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = -29;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getIntProp((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v11).setLength((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOnlyModifiesThisCall();
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getProp((((java.lang.Integer)v8).intValue()));
    Object v10 = 9;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 9;
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v4));
    Object v6 = 9;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 9;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 9;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).copyInformationFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = 9;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v5).hotSwapScript(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }
}
