package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v12));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = false;
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = -36;
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v7).putIntProp((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = "h";
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v14 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = -1;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getBooleanProp((((java.lang.Integer)v8).intValue()));
    Object v10 = "duplicate";
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v13 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v10));
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = true;
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v14),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v19 = false;
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "J";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).toString();
    Object v11 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v12 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.FunctionInjector)v6).maybePrepareCall(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = "unknown language mode";
    Object v10 = ((com.google.javascript.jscomp.JSModule)v8).removeByName(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v14));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = 0;
    Object v20 = new java.util.ArrayList((((java.lang.Integer)v19).intValue()));
    Object v21 = ((java.util.Set)v18).containsAll(((java.util.Collection)v20));
    Object v22 = false;
    Object v23 = false;
    Object v24 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v11),((java.util.Collection)v13),((java.util.Set)v18),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "[";
    Object v14 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = ",";
    Object v17 = "";
    Object v18 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)1)};
    Object v19 = new java.io.ByteArrayInputStream(((byte[])v18));
    Object v20 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v16),((java.lang.String)v17),((java.io.InputStream)v19));
    ((com.google.javascript.rhino.Node)v15).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v20));
    Object v21 = null;
    Object v22 = 0;
    Object v23 = new java.util.ArrayList((((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v24));
    Object v26 = 0;
    Object v27 = new java.util.ArrayList((((java.lang.Integer)v26).intValue()));
    Object v28 = java.util.Set.of(((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = ((java.util.Set)v28).hashCode();
    Object v30 = false;
    Object v31 = true;
    Object v32 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v14),((com.google.javascript.rhino.Node)v15),((java.util.Collection)v23),((java.util.Set)v28),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v12));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v10));
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = false;
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v14),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.FunctionInjector)v6).maybePrepareCall(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "{...}";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = 12;
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).toString();
    Object v15 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = com.google.javascript.rhino.IR.nullNode();
    Object v20 = ((com.google.javascript.rhino.Node)v18).srcrefTree(((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v21));
    Object v23 = 0;
    Object v24 = new java.util.ArrayList((((java.lang.Integer)v23).intValue()));
    Object v25 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24));
    Object v26 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v27 = false;
    Object v28 = false;
    Object v29 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v18),((java.util.Set)v25),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v26),(((java.lang.Boolean)v27).booleanValue()),(((java.lang.Boolean)v28).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v19 = ((java.lang.Enum)v18).getDeclaringClass();
    Object v20 = false;
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v10));
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = true;
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v14),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v12));
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "[";
    Object v14 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v16));
    Object v18 = 0;
    Object v19 = new java.util.ArrayList((((java.lang.Integer)v18).intValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v21));
    Object v23 = 0;
    Object v24 = new java.util.ArrayList((((java.lang.Integer)v23).intValue()));
    Object v25 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24));
    Object v26 = false;
    Object v27 = true;
    Object v28 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v14),((com.google.javascript.rhino.Node)v15),((java.util.Collection)v20),((java.util.Set)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "l";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "i";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = 1;
    ((com.google.javascript.rhino.Node)v11).setLineno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).isSyntheticBlock();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v16));
    Object v18 = 0;
    Object v19 = new java.util.ArrayList((((java.lang.Integer)v18).intValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v22 = true;
    Object v23 = false;
    Object v24 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14),((java.util.Set)v20),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = false;
    Object v19 = false;
    Object v20 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v12),((java.util.Set)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.NodeTraversal)v10).traverse(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v21 = false;
    Object v22 = true;
    Object v23 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14),((java.util.Set)v19),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v20),(((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).isLocalResultCall();
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    Object v11 = 12;
    ((com.google.javascript.rhino.Node)v10).setLength((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v14 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = "arguments";
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = ((com.google.javascript.rhino.Node)v15).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v19 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v13),((java.lang.String)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.rhino.Node)v11).getSourceFileName();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v14));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v20 = false;
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13),((java.util.Set)v18),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "[";
    Object v14 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.JSModule)v14).sortInputsByDeps(((com.google.javascript.jscomp.Compiler)v15));
    Object v16 = null;
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v18));
    Object v20 = 0;
    Object v21 = new java.util.ArrayList((((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v23));
    Object v25 = 0;
    Object v26 = new java.util.ArrayList((((java.lang.Integer)v25).intValue()));
    Object v27 = java.util.Set.of(((java.lang.Object)v24),((java.lang.Object)v26));
    Object v28 = false;
    Object v29 = true;
    Object v30 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v14),((com.google.javascript.rhino.Node)v17),((java.util.Collection)v22),((java.util.Set)v27),(((java.lang.Boolean)v28).booleanValue()),(((java.lang.Boolean)v29).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = ((com.google.javascript.rhino.Node)v11).clonePropsFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = ((com.google.javascript.rhino.Node)v14).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v17));
    Object v19 = 0;
    Object v20 = new java.util.ArrayList((((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.Set.of(((java.lang.Object)v18),((java.lang.Object)v20));
    Object v22 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v23 = true;
    Object v24 = false;
    Object v25 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14),((java.util.Set)v21),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = 0;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getIntProp((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setOptionalArg((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v12));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v16).hashCode();
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v18));
    Object v20 = 0;
    Object v21 = new java.util.ArrayList((((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = true;
    Object v24 = false;
    Object v25 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v16),((java.util.Set)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v19 = false;
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "f";
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = ((com.google.javascript.rhino.Node)v14).isEquivalentToShallow(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v12));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v11).containsAll(((java.util.Collection)v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v18));
    Object v20 = 0;
    Object v21 = new java.util.ArrayList((((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = false;
    Object v24 = true;
    Object v25 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOnlyModifiesArgumentsCall();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v14));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v20 = false;
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13),((java.util.Set)v18),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ":@";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeFirstChild();
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).getInputId();
    Object v11 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v12 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = ((java.util.Collection)v17).stream();
    Object v19 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v20 = true;
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v19 = true;
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setWasEmptyNode((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "undefine";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v7).appendStringTree(((java.lang.Appendable)v8));
    Object v9 = null;
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "parseInputKs";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v19));
    Object v21 = 0;
    Object v22 = new java.util.ArrayList((((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.Set.of(((java.lang.Object)v20),((java.lang.Object)v22));
    Object v24 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v25 = false;
    Object v26 = false;
    Object v27 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v18),((java.util.Set)v23),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v24),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.FunctionInjector)v6).maybePrepareCall(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "prototype";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "F";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).mayMutateArguments();
    Object v11 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v12 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v12));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = true;
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "JSC_SUSPICIOUS_SEMICOLON";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v19 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v13),((java.lang.String)v16),((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v10));
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = false;
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v14),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v16).getScope();
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = com.google.javascript.rhino.IR.nullNode();
    Object v20 = -4;
    ((com.google.javascript.rhino.Node)v19).setSourceEncodedPositionForTree((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v22));
    Object v24 = 0;
    Object v25 = new java.util.ArrayList((((java.lang.Integer)v24).intValue()));
    Object v26 = java.util.Set.of(((java.lang.Object)v23),((java.lang.Object)v25));
    Object v27 = ((java.util.Collection)v26).stream();
    Object v28 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v29 = true;
    Object v30 = false;
    Object v31 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v19),((java.util.Set)v26),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v28),(((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Vprototype";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "[";
    Object v14 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v13));
    Object v15 = ",";
    Object v16 = "";
    Object v17 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)1)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v15),((java.lang.String)v16),((java.io.InputStream)v18));
    Object v20 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v19));
    Object v21 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v20));
    ((com.google.javascript.jscomp.JSModule)v14).add(((com.google.javascript.jscomp.CompilerInput)v21));
    Object v22 = null;
    Object v23 = com.google.javascript.rhino.IR.nullNode();
    Object v24 = 0;
    Object v25 = new java.util.ArrayList((((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.rhino.IR.nullNode();
    Object v27 = ((java.util.Collection)v25).contains(((java.lang.Object)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v28));
    Object v30 = 0;
    Object v31 = new java.util.ArrayList((((java.lang.Integer)v30).intValue()));
    Object v32 = java.util.Set.of(((java.lang.Object)v29),((java.lang.Object)v31));
    Object v33 = ((java.util.Collection)v32).parallelStream();
    Object v34 = true;
    Object v35 = true;
    Object v36 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v14),((com.google.javascript.rhino.Node)v23),((java.util.Collection)v25),((java.util.Set)v32),(((java.lang.Boolean)v34).booleanValue()),(((java.lang.Boolean)v35).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.Collection)v11).addAll(((java.util.Collection)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = true;
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "{..4}";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    ((com.google.javascript.jscomp.FunctionInjector)v7).setKnownConstants(((java.util.Set)v12));
    Object v13 = null;
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = "(";
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v18 = ((com.google.javascript.jscomp.FunctionInjector)v7).inline(((com.google.javascript.rhino.Node)v14),((java.lang.String)v15),((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "[";
    Object v14 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v16));
    Object v18 = 0;
    Object v19 = new java.util.ArrayList((((java.lang.Integer)v18).intValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v21));
    Object v23 = 0;
    Object v24 = new java.util.ArrayList((((java.lang.Integer)v23).intValue()));
    Object v25 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24));
    Object v26 = false;
    Object v27 = false;
    Object v28 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v14),((com.google.javascript.rhino.Node)v15),((java.util.Collection)v20),((java.util.Set)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v17 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v13),((java.lang.String)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "[";
    Object v9 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.JSModule)v9).getRequires();
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v12));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v17));
    Object v19 = 0;
    Object v20 = new java.util.ArrayList((((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.Set.of(((java.lang.Object)v18),((java.lang.Object)v20));
    Object v22 = false;
    Object v23 = false;
    Object v24 = ((com.google.javascript.jscomp.FunctionInjector)v7).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v9),((com.google.javascript.rhino.Node)v11),((java.util.Collection)v16),((java.util.Set)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v19 = false;
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v21 = ((java.lang.Enum)v20).hashCode();
    Object v22 = false;
    Object v23 = false;
    Object v24 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v19),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v20),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)1)};
    Object v13 = new java.io.ByteArrayInputStream(((byte[])v12));
    Object v14 = ((java.util.Collection)v11).contains(((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v15));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = false;
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "}";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.rhino.Node)v8).getStaticSourceFile();
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = "[";
    Object v14 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v18));
    Object v20 = 0;
    Object v21 = new java.util.ArrayList((((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = true;
    Object v24 = false;
    Object v25 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v14),((com.google.javascript.rhino.Node)v15),((java.util.Collection)v17),((java.util.Set)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    ((com.google.javascript.jscomp.FunctionInjector)v7).setKnownConstants(((java.util.Set)v12));
    Object v13 = null;
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = ((com.google.javascript.jscomp.FunctionInjector)v7).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.jscomp.FunctionInjector)v7).doesFunctionMeetMinimumRequirements(((java.lang.String)v8),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v14));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = true;
    Object v22 = true;
    Object v23 = ((com.google.javascript.jscomp.FunctionInjector)v7).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13),((java.util.Set)v18),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v19),(((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "[";
    Object v8 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Collection)v11).hashCode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = false;
    Object v20 = ((com.google.javascript.jscomp.FunctionInjector)v6).inliningLowersCost(((com.google.javascript.jscomp.JSModule)v8),((com.google.javascript.rhino.Node)v9),((java.util.Collection)v11),((java.util.Set)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "-";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v11 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "v";
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = ((com.google.javascript.jscomp.FunctionInjector)v6).doesFunctionMeetMinimumRequirements(((java.lang.String)v7),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v9).addChildToFront(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v13 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v19 = true;
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = ((com.google.javascript.jscomp.FunctionInjector)v6).isDirectCallNodeReplacementPossible(((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v7));
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    ((com.google.javascript.jscomp.FunctionInjector)v6).setKnownConstants(((java.util.Set)v11));
    Object v12 = null;
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = "|";
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v17 = ((com.google.javascript.jscomp.FunctionInjector)v6).inline(((com.google.javascript.rhino.Node)v13),((java.lang.String)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v14));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v20 = true;
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.FunctionInjector)v7).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13),((java.util.Set)v18),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v13));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
    Object v19 = false;
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v12),((java.util.Set)v17),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v4));
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    Object v9 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.FunctionInjector(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.InferJSDocInfo(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = 1;
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v11).putBooleanProp((((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(((com.google.common.base.Supplier)v16));
    Object v18 = 0;
    Object v19 = new java.util.ArrayList((((java.lang.Integer)v18).intValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
    Object v22 = false;
    Object v23 = false;
    Object v24 = ((com.google.javascript.jscomp.FunctionInjector)v6).canInlineReferenceToFunction(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15),((java.util.Set)v20),((com.google.javascript.jscomp.FunctionInjector.InliningMode)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
