package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneTree();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = -14;
    Object v14 = "";
    Object v15 = 0;
    Object v16 = 15;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = -14;
    Object v19 = "";
    Object v20 = 0;
    Object v21 = 15;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.rhino.Node)v17).addChildToBack(((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    Object v24 = -14;
    Object v25 = "";
    Object v26 = 0;
    Object v27 = 15;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v6).copyInformationFrom(((com.google.javascript.rhino.Node)v11));
    Object v13 = -14;
    Object v14 = "";
    Object v15 = 0;
    Object v16 = 15;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).siblings();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isQualifiedName();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeChildren();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isQualifiedName();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = "z";
    Object v16 = "Q";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v13).putProp((((java.lang.Integer)v14).intValue()),((java.lang.Object)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = -14;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = 15;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getQualifiedName();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -14;
    Object v13 = "";
    Object v14 = 0;
    Object v15 = 15;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "=";
    ((com.google.javascript.rhino.Node)v11).setString(((java.lang.String)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getAncestors();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = -14;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = 15;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).hasSideEffects();
    Object v20 = -14;
    Object v21 = "";
    Object v22 = 0;
    Object v23 = 15;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 5;
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v12).putBooleanProp((((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = -14;
    Object v14 = "";
    Object v15 = 0;
    Object v16 = 15;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = -14;
    Object v19 = "";
    Object v20 = 0;
    Object v21 = 15;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v9).addChildToBack(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = true;
    ((com.google.javascript.rhino.Node)v20).setOptionalArg((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = -14;
    Object v24 = "";
    Object v25 = 0;
    Object v26 = 15;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeFirstChild();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = "null";
    Object v12 = ":";
    Object v13 = 1;
    Object v14 = -22;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v7).setJSType(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v16 = null;
    Object v17 = -14;
    Object v18 = "";
    Object v19 = 0;
    Object v20 = 15;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getString();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v15).setIsSyntheticBlock((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getQualifiedName();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 3;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v9).setQuotedString();
    Object v10 = null;
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 15;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = -14;
    Object v14 = "";
    Object v15 = 0;
    Object v16 = 15;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).removeFirstChild();
    Object v19 = -14;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = 15;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 13;
    Object v9 = 11;
    ((com.google.javascript.rhino.Node)v7).putIntProp((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -21;
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v14).putProp((((java.lang.Integer)v15).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getAncestors();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = -14;
    Object v13 = "";
    Object v14 = 0;
    Object v15 = 15;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v9).detachChildren();
    Object v10 = null;
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeChildren();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = "";
    Object v17 = 0;
    Object v18 = 15;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v14).addChildrenToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -17;
    ((com.google.javascript.rhino.Node)v14).setCharno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneNode();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).siblings();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).children();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).hasSideEffects();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = -14;
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 15;
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v2).intValue()),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).isQualifiedName();
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -14;
    Object v14 = "";
    Object v15 = 0;
    Object v16 = 15;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v12).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v1).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v12));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).cloneNode();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 18;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getAncestor((((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).siblings();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v7).putProp((((java.lang.Integer)v8).intValue()),((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = "";
    Object v17 = 0;
    Object v18 = 15;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = -14;
    Object v21 = "";
    Object v22 = 0;
    Object v23 = 15;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.rhino.Node)v14).addChildAfter(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).siblings();
    Object v9 = -14;
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 15;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 1;
    ((com.google.javascript.rhino.Node)v25).setType((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -68;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = "";
    Object v17 = 0;
    Object v18 = 15;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v14).checkTreeEquals(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -68;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = -14;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = 15;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.jsdoc.extraversiTn";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.jsdoc.extraversiTn";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v9).setWasEmptyNode((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = -14;
    Object v13 = "";
    Object v14 = 0;
    Object v15 = 15;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -68;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = "";
    Object v17 = 0;
    Object v18 = 15;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v14).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 11;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.jsdoc.extraversiTn";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = -14;
    Object v13 = "";
    Object v14 = 0;
    Object v15 = 15;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.jsdoc.extraversiTn";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = -14;
    Object v27 = "";
    Object v28 = 0;
    Object v29 = 15;
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v25).copyInformationFromForTree(((com.google.javascript.rhino.Node)v30));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = true;
    ((com.google.javascript.rhino.Node)v25).setVarArgs((((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.jsdoc.extraversiTn";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 32;
    ((com.google.javascript.rhino.Node)v12).removeProp((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -68;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v9).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v14));
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = "";
    Object v17 = 0;
    Object v18 = 15;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v14).addChildToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v20).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = -14;
    Object v28 = "";
    Object v29 = 0;
    Object v30 = 15;
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v14).detachChildren();
    Object v15 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -68;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -4;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = -14;
    Object v14 = "";
    Object v15 = 0;
    Object v16 = 15;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    ((com.google.javascript.rhino.Node)v17).setIsSyntheticBlock((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v9).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v14));
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "q";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTypeRegistry();
    Object v2 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = -14;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 15;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -14;
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 15;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = -14;
    Object v15 = "";
    Object v16 = 0;
    Object v17 = 15;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = -14;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = 15;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v2).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = -14;
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 15;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = -14;
    Object v22 = "";
    Object v23 = 0;
    Object v24 = 15;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = -68;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isQualifiedName();
    Object v11 = -14;
    Object v12 = "";
    Object v13 = 0;
    Object v14 = 15;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 15;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = "";
    Object v17 = 0;
    Object v18 = 15;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v14).addChildrenToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.RemoveConstantExpressions(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = -14;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = 15;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setWasEmptyNode((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = -14;
    Object v13 = "";
    Object v14 = 0;
    Object v15 = 15;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.RemoveConstantExpressions)v4).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }
}
