package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v4),((java.lang.String)v5));
    ((com.google.javascript.jscomp.ScopedAliases)v0).hotSwapScript(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = -5;
    Object v18 = true;
    ((com.google.javascript.rhino.Node)v16).putBooleanProp((((java.lang.Integer)v17).intValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    Object v20 = "";
    Object v21 = "";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).wasEmptyNode();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPositionForTree((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeFirstChild();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 13;
    Object v21 = ((com.google.javascript.rhino.Node)v19).getBooleanProp((((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getInputId();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 22;
    Object v21 = 0;
    ((com.google.javascript.rhino.Node)v19).putIntProp((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "msg.XML.not.available";
    ((com.google.javascript.rhino.Node)v19).addSuppression(((java.lang.String)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeFirstChild();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).wasEmptyNode();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setOptionalArg((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getInputId();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "black";
    Object v18 = new com.google.javascript.rhino.InputId(((java.lang.String)v17));
    ((com.google.javascript.rhino.Node)v16).setInputId(((com.google.javascript.rhino.InputId)v18));
    Object v19 = null;
    Object v20 = "";
    Object v21 = "";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "black";
    Object v14 = new com.google.javascript.rhino.InputId(((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v12).setInputId(((com.google.javascript.rhino.InputId)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).wasEmptyNode();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = new java.io.StringWriter((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.rhino.Node)v9).appendStringTree(((java.lang.Appendable)v11));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getSourceFileName();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 0;
    Object v19 = new java.io.StringWriter((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v17).appendStringTree(((java.lang.Appendable)v19));
    Object v20 = null;
    Object v21 = "";
    Object v22 = "";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).hasSideEffects();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v12).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isFromExterns();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setOptionalArg((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "z";
    Object v21 = "Q";
    Object v22 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v24 = "";
    Object v25 = "";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = 0;
    Object v28 = new java.io.StringWriter((((java.lang.Integer)v27).intValue()));
    Object v29 = "black";
    Object v30 = new com.google.javascript.rhino.InputId(((java.lang.String)v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    ((com.google.javascript.rhino.Node)v19).setDirectives(((java.util.Set)v31));
    Object v32 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = false;
    ((com.google.javascript.rhino.Node)v17).setWasEmptyNode((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    Object v20 = "";
    Object v21 = "";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isVarArgs();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v12).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "z";
    Object v15 = "Q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = new java.io.StringWriter((((java.lang.Integer)v21).intValue()));
    Object v23 = "black";
    Object v24 = new com.google.javascript.rhino.InputId(((java.lang.String)v23));
    Object v25 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v24));
    ((com.google.javascript.rhino.Node)v13).setDirectives(((java.util.Set)v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSideEffectFlags();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    ((com.google.javascript.rhino.Node)v9).addSuppression(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setOptionalArg((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).cloneNode();
    Object v19 = "";
    Object v20 = "";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v9).detachChildren();
    Object v10 = null;
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setIsSyntheticBlock((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isFromExterns();
    Object v19 = "";
    Object v20 = "";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v13).setCharno((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeFirstChild();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v9).addChildToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).hasSideEffects();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = false;
    Object v11 = true;
    Object v12 = false;
    Object v13 = ((com.google.javascript.rhino.Node)v9).toString((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "6";
    ((com.google.javascript.rhino.Node)v16).addSuppression(((java.lang.String)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).useSourceInfoFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 0;
    ((com.google.javascript.rhino.Node)v10).setCharno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "nulG";
    Object v12 = new java.io.File(((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v12));
    ((com.google.javascript.rhino.Node)v10).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isNoSideEffectsCall();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 16;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getIntProp((((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = -2;
    Object v16 = ((com.google.javascript.rhino.Node)v14).getIntProp((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    ((com.google.javascript.rhino.Node)v9).addSuppression(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = -5;
    ((com.google.javascript.rhino.Node)v10).setSourceEncodedPosition((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJsDocBuilderForNode();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = 25;
    Object v15 = "nulG";
    Object v16 = new java.io.File(((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v13).putProp((((java.lang.Integer)v14).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isNoSideEffectsCall();
    Object v19 = "";
    Object v20 = "";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getAncestors();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 1;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v15).detachChildren();
    Object v16 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isQualifiedName();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).isEquivalentToTyped(((com.google.javascript.rhino.Node)v13));
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 26;
    ((com.google.javascript.rhino.Node)v10).setType((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isOptionalArg();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = -2;
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v12).putBooleanProp((((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isVarArgs();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getJSDocInfo();
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = -5;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getBooleanProp((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.rhino.Node)v16).addChildrenToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    Object v21 = "";
    Object v22 = "";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 14;
    ((com.google.javascript.rhino.Node)v23).setLineno((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v23));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getJSDocInfo();
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "7";
    ((com.google.javascript.rhino.Node)v12).addSuppression(((java.lang.String)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.Node)v19).getQualifiedName();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getStaticSourceFile();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isOptionalArg();
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = false;
    ((com.google.javascript.rhino.Node)v19).setOptionalArg((((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "method \"{0}\" called with more than one argument";
    ((com.google.javascript.rhino.Node)v13).setSourceFileForTesting(((java.lang.String)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).toStringTree();
    Object v18 = "";
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = 8;
    Object v22 = ((com.google.javascript.rhino.Node)v20).getAncestor((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getInputId();
    Object v19 = "";
    Object v20 = "";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = 0;
    Object v23 = new java.io.StringWriter((((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.rhino.Node)v21).appendStringTree(((java.lang.Appendable)v23));
    Object v24 = null;
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getQualifiedName();
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setLineno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getStaticSourceFile();
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.ScopedAliases)v7).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).copyInformationFromForTree(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = new java.io.StringWriter((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v10).appendStringTree(((java.lang.Appendable)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v5));
    Object v7 = "";
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).siblings();
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.ScopedAliases)v6).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v4).getAllSymbols();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.ScopedAliases(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v4),((com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isLocalResultCall();
    ((com.google.javascript.jscomp.ScopedAliases)v7).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }
}
