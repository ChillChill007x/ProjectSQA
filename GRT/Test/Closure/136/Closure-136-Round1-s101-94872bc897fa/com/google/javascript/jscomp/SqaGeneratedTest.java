package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_renameProerty";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "";
    Object v19 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_renameProerty";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.RenameVars)v10).getVariableMap();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = "O";
    Object v3 = true;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new byte[]{};
    Object v7 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v6));
    Object v8 = new char[]{Character.valueOf((char)1)};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = ((java.util.Set)v10).isEmpty();
    Object v12 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v7),((char[])v8),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "g.";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_renameProerty";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).hasSideEffects();
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "g.";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setWasEmptyNode((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.Node)v18).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_renameProerty";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = ((com.google.javascript.jscomp.RenameVars)v10).getVariableMap();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_renameProerty";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -26;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "U";
    Object v5 = false;
    Object v6 = true;
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "JSCompiler_renameProerty";
    Object v10 = false;
    Object v11 = true;
    Object v12 = true;
    Object v13 = new byte[]{};
    Object v14 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v13));
    Object v15 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v16 = java.util.Comparator.naturalOrder();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.VariableMap)v14),((char[])v15),((java.util.Set)v17));
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "";
    Object v23 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v24 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v22),((java.lang.String)v23));
    ((com.google.javascript.jscomp.RenameVars)v18).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    Object v26 = ((com.google.javascript.jscomp.RenameVars)v18).getVariableMap();
    Object v27 = ", ";
    Object v28 = ((com.google.javascript.jscomp.VariableMap)v26).lookupNewName(((java.lang.String)v27));
    Object v29 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v30 = java.util.Comparator.naturalOrder();
    Object v31 = new java.util.TreeSet(((java.util.Comparator)v30));
    Object v32 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v26),((char[])v29),((java.util.Set)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "return";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "return";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -26;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "U";
    Object v5 = false;
    Object v6 = true;
    Object v7 = false;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "JSCompiler_renameProerty";
    Object v10 = false;
    Object v11 = true;
    Object v12 = true;
    Object v13 = new byte[]{};
    Object v14 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v13));
    Object v15 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v16 = java.util.Comparator.naturalOrder();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.VariableMap)v14),((char[])v15),((java.util.Set)v17));
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "";
    Object v23 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v24 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v22),((java.lang.String)v23));
    ((com.google.javascript.jscomp.RenameVars)v18).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    Object v26 = ((com.google.javascript.jscomp.RenameVars)v18).getVariableMap();
    Object v27 = ", ";
    Object v28 = ((com.google.javascript.jscomp.VariableMap)v26).lookupNewName(((java.lang.String)v27));
    Object v29 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v30 = java.util.Comparator.naturalOrder();
    Object v31 = new java.util.TreeSet(((java.util.Comparator)v30));
    Object v32 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v26),((char[])v29),((java.util.Set)v31));
    Object v33 = "";
    Object v34 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v35 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = "";
    Object v37 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v38 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v36),((java.lang.String)v37));
    ((com.google.javascript.jscomp.RenameVars)v32).process(((com.google.javascript.rhino.Node)v35),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_renameProerty";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setWasEmptyNode((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "return";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setVarArgs((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = " ";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.RenameVars)v15).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v24 = " ";
    ((com.google.javascript.jscomp.VariableMap)v23).save(((java.lang.String)v24));
    Object v25 = null;
    Object v26 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v27 = java.util.Comparator.naturalOrder();
    Object v28 = new java.util.TreeSet(((java.util.Comparator)v27));
    Object v29 = java.util.Comparator.naturalOrder();
    Object v30 = new java.util.TreeSet(((java.util.Comparator)v29));
    Object v31 = ((java.util.Set)v28).removeAll(((java.util.Collection)v30));
    Object v32 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v23),((char[])v26),((java.util.Set)v28));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = "";
    Object v3 = true;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "JSCompiler_renameProerty";
    Object v8 = false;
    Object v9 = true;
    Object v10 = true;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v18 = new char[]{Character.valueOf((char)0)};
    Object v19 = java.util.Comparator.naturalOrder();
    Object v20 = new java.util.TreeSet(((java.util.Comparator)v19));
    Object v21 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v17),((char[])v18),((java.util.Set)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "fal}se";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = "Q";
    ((com.google.javascript.jscomp.VariableMap)v6).save(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v10 = java.util.Comparator.naturalOrder();
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v9),((java.util.Set)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "B";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "inlineFunctions";
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "JSCompiler_renameProerty";
    Object v8 = false;
    Object v9 = true;
    Object v10 = true;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = "";
    Object v18 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    Object v21 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    ((com.google.javascript.jscomp.RenameVars)v16).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v25 = ((com.google.javascript.jscomp.VariableMap)v24).toBytes();
    Object v26 = new char[]{};
    Object v27 = java.util.Comparator.naturalOrder();
    Object v28 = new java.util.TreeSet(((java.util.Comparator)v27));
    Object v29 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v24),((char[])v26),((java.util.Set)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "";
    Object v19 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "4";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "return";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "";
    Object v19 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    ((com.google.javascript.rhino.Node)v20).addChildToFront(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = "";
    Object v26 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v27 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v25),((java.lang.String)v26));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\n";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "0";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.RenameVars)v15).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v24 = new char[]{Character.valueOf((char)1)};
    Object v25 = java.util.Comparator.naturalOrder();
    Object v26 = new java.util.TreeSet(((java.util.Comparator)v25));
    Object v27 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v23),((char[])v24),((java.util.Set)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\n";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "addDependency";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ".i";
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new byte[]{};
    Object v9 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v8));
    Object v10 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v9),((char[])v10),((java.util.Set)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "SING";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "addDependency";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ".i";
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new byte[]{};
    Object v9 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v8));
    Object v10 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v9),((char[])v10),((java.util.Set)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.jscomp.RenameVars)v13).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "SING";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v13).addChildToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "";
    Object v19 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = ((com.google.javascript.jscomp.VariableMap)v6).toBytes();
    Object v8 = new char[]{};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v8),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "SING";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setVarArgs((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "protTtype";
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "K";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = "";
    Object v8 = ((com.google.javascript.jscomp.VariableMap)v6).lookupNewName(((java.lang.String)v7));
    Object v9 = new char[]{};
    Object v10 = java.util.Comparator.naturalOrder();
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v9),((java.util.Set)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = "Bag line: ";
    ((com.google.javascript.jscomp.VariableMap)v16).save(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new char[]{};
    Object v20 = java.util.Comparator.naturalOrder();
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v19),((java.util.Set)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = ((java.util.Collection)v9).stream();
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getReverseAbstractInterpreter();
    Object v2 = "prototype";
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new byte[]{};
    Object v7 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v6));
    Object v8 = new char[]{Character.valueOf((char)0)};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v7),((char[])v8),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = " type: r";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = ((java.util.Collection)v9).stream();
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v12 = "";
    Object v13 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.RenameVars)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "";
    Object v23 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v24 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v22),((java.lang.String)v23));
    ((com.google.javascript.jscomp.RenameVars)v11).process(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "protTtype";
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "inlineFunctions";
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "JSCompiler_renameProerty";
    Object v8 = false;
    Object v9 = true;
    Object v10 = true;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = "";
    Object v18 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    Object v21 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    ((com.google.javascript.jscomp.RenameVars)v16).process(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v25 = ((com.google.javascript.jscomp.VariableMap)v24).toBytes();
    Object v26 = new char[]{};
    Object v27 = java.util.Comparator.naturalOrder();
    Object v28 = new java.util.TreeSet(((java.util.Comparator)v27));
    Object v29 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v24),((char[])v26),((java.util.Set)v28));
    Object v30 = "";
    Object v31 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v32 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = "";
    Object v34 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v35 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v33),((java.lang.String)v34));
    ((com.google.javascript.jscomp.RenameVars)v29).process(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "null";
    Object v5 = true;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new byte[]{};
    Object v9 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v8));
    Object v10 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v9),((char[])v10),((java.util.Set)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "addDependency";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ".i";
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new byte[]{};
    Object v9 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v8));
    Object v10 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v9),((char[])v10),((java.util.Set)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    Object v21 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v19).checkTreeEquals(((com.google.javascript.rhino.Node)v22));
    ((com.google.javascript.jscomp.RenameVars)v13).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "B";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "";
    Object v19 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = ((com.google.javascript.jscomp.RenameVars)v10).getVariableMap();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "";
    Object v19 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = true;
    ((com.google.javascript.rhino.Node)v20).setOptionalArg((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = "";
    Object v24 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v25 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v23),((java.lang.String)v24));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "return";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = ((com.google.javascript.jscomp.RenameVars)v10).getVariableMap();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "DESC";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "*";
    Object v2 = true;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = "white";
    Object v3 = true;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "return";
    Object v8 = false;
    Object v9 = true;
    Object v10 = false;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v18 = new char[]{};
    Object v19 = java.util.Comparator.naturalOrder();
    Object v20 = new java.util.TreeSet(((java.util.Comparator)v19));
    Object v21 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v17),((char[])v18),((java.util.Set)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "DESC";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "`MPTY";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = true;
    ((com.google.javascript.rhino.Node)v16).setVarArgs((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = "white";
    Object v3 = true;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "return";
    Object v8 = false;
    Object v9 = true;
    Object v10 = false;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v18 = new char[]{};
    Object v19 = java.util.Comparator.naturalOrder();
    Object v20 = new java.util.TreeSet(((java.util.Comparator)v19));
    Object v21 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v17),((char[])v18),((java.util.Set)v20));
    Object v22 = "";
    Object v23 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v24 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "";
    Object v26 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v27 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v25),((java.lang.String)v26));
    ((com.google.javascript.jscomp.RenameVars)v21).process(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).children();
    Object v15 = "";
    Object v16 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "`MPTY";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    ((com.google.javascript.rhino.Node)v23).addChildrenToFront(((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    Object v28 = "";
    Object v29 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v30 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v28),((java.lang.String)v29));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "null";
    Object v5 = true;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new byte[]{};
    Object v9 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v8));
    Object v10 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v9),((char[])v10),((java.util.Set)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.jscomp.RenameVars)v13).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "*";
    Object v2 = true;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "B";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)105),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "B";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.RenameVars)v10).getVariableMap();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "`";
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = "label renam*ed: ";
    Object v18 = ((com.google.javascript.jscomp.VariableMap)v16).lookupNewName(((java.lang.String)v17));
    Object v19 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v20 = java.util.Comparator.naturalOrder();
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v19),((java.util.Set)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = "white";
    Object v3 = true;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "return";
    Object v8 = false;
    Object v9 = true;
    Object v10 = false;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v18 = new char[]{};
    Object v19 = java.util.Comparator.naturalOrder();
    Object v20 = new java.util.TreeSet(((java.util.Comparator)v19));
    Object v21 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v17),((char[])v18),((java.util.Set)v20));
    Object v22 = "";
    Object v23 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v24 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "";
    Object v26 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v27 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v25),((java.lang.String)v26));
    ((com.google.javascript.jscomp.RenameVars)v21).process(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = "";
    Object v30 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v31 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = "";
    Object v33 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v34 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = 2;
    Object v36 = true;
    ((com.google.javascript.rhino.Node)v34).putBooleanProp((((java.lang.Integer)v35).intValue()),(((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
    ((com.google.javascript.jscomp.RenameVars)v21).process(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v34));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "DESC";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = "";
    Object v28 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v29 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v26).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v29));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$$";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$$";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    Object v28 = "";
    Object v29 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v30 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = "";
    Object v32 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v33 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = true;
    Object v35 = true;
    Object v36 = true;
    Object v37 = ((com.google.javascript.rhino.Node)v33).toString((((java.lang.Boolean)v34).booleanValue()),(((java.lang.Boolean)v35).booleanValue()),(((java.lang.Boolean)v36).booleanValue()));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v33));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "PDBLIC";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)38)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "`MPTY";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = "";
    Object v28 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v29 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v26).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v29));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v13).appendStringTree(((java.lang.Appendable)v14));
    Object v15 = null;
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "X";
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = "toSt>ing";
    ((com.google.javascript.jscomp.VariableMap)v6).save(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = new char[]{Character.valueOf((char)1)};
    Object v10 = java.util.Comparator.naturalOrder();
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v9),((java.util.Set)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "false";
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new byte[]{};
    Object v7 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v6));
    Object v8 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v7),((char[])v8),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = "Bag line: ";
    ((com.google.javascript.jscomp.VariableMap)v16).save(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new char[]{};
    Object v20 = java.util.Comparator.naturalOrder();
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v19),((java.util.Set)v21));
    Object v23 = ((com.google.javascript.jscomp.RenameVars)v22).getVariableMap();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).children();
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "null";
    Object v5 = true;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new byte[]{};
    Object v9 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v8));
    Object v10 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.VariableMap)v9),((char[])v10),((java.util.Set)v12));
    Object v14 = ((com.google.javascript.jscomp.RenameVars)v13).getVariableMap();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "false";
    Object v3 = false;
    Object v4 = true;
    Object v5 = false;
    Object v6 = new byte[]{};
    Object v7 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v6));
    Object v8 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v7),((char[])v8),((java.util.Set)v10));
    Object v12 = "";
    Object v13 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.RenameVars)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = ((com.google.javascript.jscomp.VariableMap)v6).toBytes();
    Object v8 = new char[]{};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v8),((java.util.Set)v10));
    Object v12 = "";
    Object v13 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.RenameVars)v11).process(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)1)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "`";
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = "label renam*ed: ";
    Object v18 = ((com.google.javascript.jscomp.VariableMap)v16).lookupNewName(((java.lang.String)v17));
    Object v19 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v20 = java.util.Comparator.naturalOrder();
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v19),((java.util.Set)v21));
    Object v23 = "";
    Object v24 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v25 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = "";
    Object v27 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v28 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v26),((java.lang.String)v27));
    ((com.google.javascript.jscomp.RenameVars)v22).process(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "STRING_OBJECT_TYPE";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = 0;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "null";
    Object v10 = true;
    Object v11 = false;
    Object v12 = false;
    Object v13 = new byte[]{};
    Object v14 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v13));
    Object v15 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v16 = java.util.Comparator.naturalOrder();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.VariableMap)v14),((char[])v15),((java.util.Set)v17));
    Object v19 = ((com.google.javascript.jscomp.RenameVars)v18).getVariableMap();
    Object v20 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v21 = java.util.Comparator.naturalOrder();
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v19),((char[])v20),((java.util.Set)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\n";
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    Object v21 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    ((com.google.javascript.rhino.Node)v16).addChildAfter(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = "L";
    Object v3 = false;
    Object v4 = false;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "";
    Object v8 = false;
    Object v9 = false;
    Object v10 = true;
    Object v11 = new byte[]{};
    Object v12 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v11));
    Object v13 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.VariableMap)v12),((char[])v13),((java.util.Set)v15));
    Object v17 = ((com.google.javascript.jscomp.RenameVars)v16).getVariableMap();
    Object v18 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v19 = java.util.Comparator.naturalOrder();
    Object v20 = new java.util.TreeSet(((java.util.Comparator)v19));
    Object v21 = java.util.Comparator.naturalOrder();
    Object v22 = ((java.util.Set)v20).remove(((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v17),((char[])v18),((java.util.Set)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).siblings();
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)105),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    Object v28 = "";
    Object v29 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v30 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = "";
    Object v32 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v33 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v31),((java.lang.String)v32));
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "&call";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "prototype";
    Object v7 = true;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = "JSCompiler_renameProerty";
    Object v12 = false;
    Object v13 = true;
    Object v14 = true;
    Object v15 = new byte[]{};
    Object v16 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v15));
    Object v17 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = ((com.google.javascript.jscomp.RenameVars)v20).getVariableMap();
    Object v22 = "Bag line: ";
    ((com.google.javascript.jscomp.VariableMap)v21).save(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = new char[]{};
    Object v25 = java.util.Comparator.naturalOrder();
    Object v26 = new java.util.TreeSet(((java.util.Comparator)v25));
    Object v27 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v21),((char[])v24),((java.util.Set)v26));
    Object v28 = ((com.google.javascript.jscomp.RenameVars)v27).getVariableMap();
    Object v29 = new char[]{};
    Object v30 = java.util.Comparator.naturalOrder();
    Object v31 = new java.util.TreeSet(((java.util.Comparator)v30));
    Object v32 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v28),((char[])v29),((java.util.Set)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "STRING_OBJECT_TYPE";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = 0;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "null";
    Object v10 = true;
    Object v11 = false;
    Object v12 = false;
    Object v13 = new byte[]{};
    Object v14 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v13));
    Object v15 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v16 = java.util.Comparator.naturalOrder();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.VariableMap)v14),((char[])v15),((java.util.Set)v17));
    Object v19 = ((com.google.javascript.jscomp.RenameVars)v18).getVariableMap();
    Object v20 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v21 = java.util.Comparator.naturalOrder();
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v19),((char[])v20),((java.util.Set)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = true;
    ((com.google.javascript.rhino.Node)v26).setIsSyntheticBlock((((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    Object v29 = "";
    Object v30 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v31 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v29),((java.lang.String)v30));
    ((com.google.javascript.jscomp.RenameVars)v23).process(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new byte[]{};
    Object v6 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v6),((char[])v7),((java.util.Set)v9));
    Object v11 = "";
    Object v12 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.RenameVars)v10).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = true;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "JSCompiler_renameProerty";
    Object v7 = false;
    Object v8 = true;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = "Bag line: ";
    ((com.google.javascript.jscomp.VariableMap)v16).save(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = new char[]{};
    Object v20 = java.util.Comparator.naturalOrder();
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v19),((java.util.Set)v21));
    Object v23 = "";
    Object v24 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v25 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = "";
    Object v27 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v28 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v26),((java.lang.String)v27));
    ((com.google.javascript.jscomp.RenameVars)v22).process(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = "|";
    Object v3 = false;
    Object v4 = false;
    Object v5 = false;
    Object v6 = new byte[]{};
    Object v7 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v6));
    Object v8 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v9 = java.util.Comparator.naturalOrder();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.VariableMap)v7),((char[])v8),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_ObjectProper8yString";
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = 0;
    Object v8 = ((com.google.javascript.jscomp.SourceExcerptProvider)v5).getSourceLine(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "null";
    Object v10 = true;
    Object v11 = false;
    Object v12 = false;
    Object v13 = new byte[]{};
    Object v14 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v13));
    Object v15 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v16 = java.util.Comparator.naturalOrder();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.VariableMap)v14),((char[])v15),((java.util.Set)v17));
    Object v19 = ((com.google.javascript.jscomp.RenameVars)v18).getVariableMap();
    Object v20 = new char[]{Character.valueOf((char)1)};
    Object v21 = java.util.Comparator.naturalOrder();
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v19),((char[])v20),((java.util.Set)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "protoype";
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "return";
    Object v7 = false;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = ((com.google.javascript.jscomp.VariableMap)v16).toBytes();
    Object v18 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v19 = java.util.Comparator.naturalOrder();
    Object v20 = new java.util.TreeSet(((java.util.Comparator)v19));
    Object v21 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v18),((java.util.Set)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "`MPTY";
    Object v2 = true;
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "";
    Object v7 = false;
    Object v8 = false;
    Object v9 = true;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v17 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v16),((char[])v17),((java.util.Set)v19));
    Object v21 = "";
    Object v22 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = "";
    Object v28 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v29 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v27),((java.lang.String)v28));
    ((com.google.javascript.rhino.Node)v26).addChildToFront(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    ((com.google.javascript.jscomp.RenameVars)v20).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Z";
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "B";
    Object v7 = true;
    Object v8 = true;
    Object v9 = false;
    Object v10 = new byte[]{};
    Object v11 = com.google.javascript.jscomp.VariableMap.fromBytes(((byte[])v10));
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v13 = java.util.Comparator.naturalOrder();
    Object v14 = new java.util.TreeSet(((java.util.Comparator)v13));
    Object v15 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.VariableMap)v11),((char[])v12),((java.util.Set)v14));
    Object v16 = "";
    Object v17 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = "JSC_RWPORT_PATH_IO_ERROR";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.RenameVars)v15).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.RenameVars)v15).getVariableMap();
    Object v24 = new char[]{Character.valueOf((char)0)};
    Object v25 = java.util.Comparator.naturalOrder();
    Object v26 = new java.util.TreeSet(((java.util.Comparator)v25));
    Object v27 = new com.google.javascript.jscomp.RenameVars(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.VariableMap)v23),((char[])v24),((java.util.Set)v26));
    org.junit.Assert.assertNotNull(v27);
  }
}
