package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "The flags variable_map_output_file and create_name_map_files cannot both be used simultaniously.";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v5).setOptionalArg((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = false;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "~";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    ((com.google.javascript.rhino.Node)v7).putProp((((java.lang.Integer)v8).intValue()),((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = "";
    Object v12 = false;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "ERROR";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildAfter(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).isEquivalentToTyped(((com.google.javascript.rhino.Node)v14));
    Object v16 = "";
    Object v17 = true;
    Object v18 = true;
    Object v19 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ">";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = "DATE";
    Object v12 = true;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ": ";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = ".";
    Object v12 = true;
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "prototypeg";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v5).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = true;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "M";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "N";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ";";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "R";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "t";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    Object v10 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v9));
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    Object v14 = 25;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = "U";
    Object v18 = false;
    Object v19 = true;
    Object v20 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v13),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "+";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).copyInformationFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = "c";
    Object v12 = false;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "undefined";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = "";
    Object v11 = false;
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "undefine";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "G";
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "g.";
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ")";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).setType((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = "g";
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "number";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "arguments";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ".#rototype.";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).clonePropsFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    ((com.google.javascript.rhino.Node)v10).addSuppression(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = "{SynthetcVarsDeclar}";
    Object v14 = false;
    Object v15 = true;
    Object v16 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = " ";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "argumpnts";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ")";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "j";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    Object v12 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10),((java.lang.Object)v11));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v12));
    Object v13 = null;
    Object v14 = "e";
    Object v15 = true;
    Object v16 = true;
    Object v17 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "null";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.rhino.Node)v5).addChildToFront(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = "replaceStrings";
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = "Nrmalize constraints violated:\n";
    Object v12 = true;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "Z";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = "argument?s";
    ((com.google.javascript.rhino.Node)v5).addSuppression(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "deterministic instanceof yields false";
    Object v11 = true;
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "throw";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = " is not a string node";
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ".";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "I";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getJsDocBuilderForNode();
    Object v9 = "'";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = ".prototype.";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "E";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "overriding prototype with non-object";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).removeChildren();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "DEFAULT";
    Object v10 = false;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "<";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = " ";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "(";
    Object v9 = true;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "B";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).hasSideEffects();
    Object v9 = "";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "@";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isQualifiedName();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).siblings();
    Object v10 = "l";
    Object v11 = true;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "nul";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 52;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.rhino.Node)v7).putProp((((java.lang.Integer)v8).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    Object v12 = "~";
    Object v13 = false;
    Object v14 = true;
    Object v15 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "9";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "msg.jsdoc";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = " frot module ";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "b";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "brea$k";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "k";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toString();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "inline_";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "prototype";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ".";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "msg.jsdoc.extends.duplicate";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "JSCompiler_inline_la,el_";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "__";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "L1ineNumber";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "JSCompiler_renameProperty";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "LEGACvY";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "module {0} cannot reference {2}, defined in module {1}";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getQualifiedName();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "Nuber";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "Unex)ected call site type.";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "G";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "(o";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = "_";
    Object v13 = true;
    Object v14 = false;
    Object v15 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "deadAssignmen";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "w";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "MSG_";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ".prototype";
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "[";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = " - ";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "d";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "Cannot call clear() after build().";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ">";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "<";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "M";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "[)";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "CATOCH_SCOPE";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    Object v14 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    ((com.google.javascript.rhino.Node)v8).putProp((((java.lang.Integer)v9).intValue()),((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = "(";
    Object v17 = true;
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "prototype";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 31;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    Object v10 = "call";
    Object v11 = true;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "-";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "FALE";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "?";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = 18;
    ((com.google.javascript.rhino.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = "K";
    Object v13 = true;
    Object v14 = true;
    Object v15 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "PARAM";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "H";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "e";
    Object v9 = true;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "L";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "w3c_css.js";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "Note an assiment op";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "_";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "@";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).isEquivalentTo(((com.google.javascript.rhino.Node)v9));
    Object v11 = "u";
    Object v12 = false;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "V";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ",";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "X";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "x";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "inline_";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "Z";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "Ambiguous use of a named function: {0}.";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "=";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "q";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getQualifiedName();
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = false;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "prototype";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = ">";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = ":";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v8).appendStringTree(((java.lang.Appendable)v9));
    Object v10 = null;
    Object v11 = "$$";
    Object v12 = false;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "f";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toString();
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "retun";
    Object v10 = true;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setWasEmptyNode((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = "ERROR";
    Object v12 = false;
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "DELTREF";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ".";
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "K";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = "2";
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "?";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "F";
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "apply";
    Object v11 = false;
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = "Normalize constraints violated:\n";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v3 = "";
    Object v4 = 25;
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()));
    Object v6 = 25;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()));
    Object v8 = ".prot";
    Object v9 = false;
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v2).mutate(((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "prototpe";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v6).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v7));
    Object v8 = null;
    Object v9 = 25;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()));
    Object v11 = 25;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()));
    Object v13 = 25;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildAfter(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = "H";
    Object v17 = false;
    Object v18 = true;
    Object v19 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "try";
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getQualifiedName();
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "/";
    Object v11 = false;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "m";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "i";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "(";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeChildren();
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = 25;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v9).addChildAfter(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = true;
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "DEPS_PARSE_WARNING";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = false;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.rhino.Node)v6).addChildToBack(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 25;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()));
    Object v12 = ">";
    Object v13 = true;
    Object v14 = true;
    Object v15 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "\n";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "prototype";
    Object v10 = false;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeChildren();
    Object v10 = "p";
    Object v11 = false;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = false;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "[";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = 25;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()));
    Object v10 = "msg.XML.bad.frm";
    Object v11 = false;
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = ".protcotype.";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "}";
    Object v10 = false;
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v2 = ((com.google.common.base.Supplier)v1).get();
    Object v3 = new com.google.javascript.jscomp.FunctionToBlockMutator(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.common.base.Supplier)v1));
    Object v4 = "";
    Object v5 = 25;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()));
    Object v7 = 25;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.FunctionToBlockMutator)v3).mutate(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
