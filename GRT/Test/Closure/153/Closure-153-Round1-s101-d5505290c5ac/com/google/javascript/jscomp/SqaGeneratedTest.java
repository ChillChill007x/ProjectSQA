package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ELSE";
    Object v2 = " ->A";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "nVull";
    Object v2 = ".prototype.";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "nVull";
    Object v5 = ".prototype.";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "nVull";
    Object v9 = ".prototype.";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "nVull";
    Object v5 = ".prototype.";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "nVull";
    Object v9 = ".prototype.";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 32;
    ((com.google.javascript.rhino.Node)v10).setCharno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Date";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "nknown module: '";
    Object v2 = "*";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "nVull";
    Object v5 = ".prototype.";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toString();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "Date";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "%";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ML";
    Object v2 = "}";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "nVull";
    Object v5 = ".prototype.";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "nVull";
    Object v9 = ".prototype.";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "";
    Object v3 = ".";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ".";
    Object v2 = -47;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "pro+otype";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "Date";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v7).reportCodeChange();
    Object v8 = null;
    Object v9 = "";
    Object v10 = ".";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = "%";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v12),((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v6).addChildAfter(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = "Date";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "[";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = "q";
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "MS_";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "H";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = "";
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "%";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).toString();
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "%";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v7).reportCodeChange();
    Object v8 = null;
    Object v9 = "";
    Object v10 = ".";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "l";
    Object v2 = "n";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "t";
    Object v2 = "&";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "nmber";
    Object v2 = "argumen";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "l";
    Object v5 = "n";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "l";
    Object v9 = "n";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = "";
    Object v3 = "i\\.";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "\"";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = "";
    Object v7 = ".";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getTopScope();
    Object v11 = "";
    Object v12 = "i\\.";
    Object v13 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "";
    Object v5 = "\"";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "";
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getAncestor((((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = "1";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "-ABEL";
    Object v2 = "public";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "9-";
    Object v2 = -28;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ",";
    Object v5 = "' in the factory list";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "";
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = ",";
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "Date";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "l";
    Object v10 = "n";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "should be assigned a value.";
    Object v2 = 1;
    Object v3 = 25;
    Object v4 = "Z";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = " o\\f ";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = ": ";
    Object v12 = "typeof ";
    Object v13 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = " ";
    Object v2 = "window";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = "";
    Object v7 = ".";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = "";
    Object v11 = "\"";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = "-ABEL";
    Object v15 = "public";
    Object v16 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v12).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "";
    Object v6 = "\"";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "%";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "x";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "r";
    Object v2 = "\n\nSubtree:\n ";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ">";
    Object v2 = ".proEtotype";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "1";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = "his";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "7";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "";
    Object v5 = "7";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "nmber";
    Object v9 = "argumen";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "nulF";
    Object v2 = "#";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "DEPS_PARSE_WARNING";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "arguments";
    Object v2 = "'";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = "";
    Object v3 = "g";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "should be assigned a value.";
    Object v9 = 1;
    Object v10 = 25;
    Object v11 = "Z";
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = " o\\f ";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v11),((com.google.javascript.jscomp.CheckLevel)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{};
    Object v16 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.AbstractCompiler)v7).report(((com.google.javascript.jscomp.JSError)v16));
    Object v17 = null;
    Object v18 = ": ";
    Object v19 = "typeof ";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v18),((java.lang.String)v19));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "e";
    Object v3 = "prototyp";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "`";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "*";
    Object v2 = "Z";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "\\u";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "should be assigned a value.";
    Object v2 = 1;
    Object v3 = 25;
    Object v4 = "Z";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = " o\\f ";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = ")";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "";
    Object v6 = "7";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "";
    Object v10 = "`";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "B";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "";
    Object v5 = "MS_";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "nmber";
    Object v9 = "argumen";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "should be assigned a value.";
    Object v2 = 1;
    Object v3 = 25;
    Object v4 = "Z";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = " o\\f ";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "call";
    Object v12 = "function";
    Object v13 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Normalize constraints violated:\n";
    Object v2 = "\\u";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Q";
    Object v2 = "numb?er";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "";
    Object v5 = "B";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "";
    Object v9 = "`";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v7),((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.Normalize)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = "";
    Object v7 = ".";
    Object v8 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = "l";
    Object v11 = "n";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = "";
    Object v15 = "\"";
    Object v16 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v12).copyInformationFrom(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "deprecated";
    Object v2 = " :";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ";";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ".protoEtype";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "vari";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "deprecated";
    Object v6 = " :";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "";
    Object v10 = "`";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "9-";
    Object v6 = -28;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ",";
    Object v9 = "' in the factory list";
    Object v10 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = "*";
    Object v13 = "Z";
    Object v14 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v11),((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "D";
    Object v2 = "H";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ")";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSC_HIDDEN_INTERFACE_PROPERTY";
    Object v2 = "Q";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "should be assigned a value.";
    Object v6 = 1;
    Object v7 = 25;
    Object v8 = "Z";
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = " o\\f ";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v8),((com.google.javascript.jscomp.CheckLevel)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).report(((com.google.javascript.jscomp.JSError)v13));
    Object v14 = null;
    Object v15 = ": ";
    Object v16 = "typeof ";
    Object v17 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = "";
    Object v20 = "7";
    Object v21 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v18),((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "should be assigned a value.";
    Object v2 = 1;
    Object v3 = 25;
    Object v4 = "Z";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = " o\\f ";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "L";
    Object v2 = "con";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "";
    Object v6 = "MS_";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "";
    Object v10 = "MS_";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = "";
    Object v3 = "I";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = "arguments";
    Object v3 = "$";
    Object v4 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = " (";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "JSC_IL~EGAL_NAME";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "Removed ";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Undefined";
    Object v2 = "runCu";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "ELSE";
    Object v6 = " ->A";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "deprecated";
    Object v10 = " :";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v7).copyInformationFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = "";
    Object v15 = "JSC_IL~EGAL_NAME";
    Object v16 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v13),((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "";
    Object v6 = "JSC_IL~EGAL_NAME";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "";
    Object v10 = "JSC_IL~EGAL_NAME";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "PRESERVE_BLOCK";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "*";
    Object v6 = "Z";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v8).reportCodeChange();
    Object v9 = null;
    Object v10 = "";
    Object v11 = ".";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ".pototype";
    Object v2 = "4val";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "function";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "7";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "W";
    Object v2 = "undefined";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "";
    Object v6 = "Removed ";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setIsSyntheticBlock((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = "l";
    Object v12 = "n";
    Object v13 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v10),((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.Normalize)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "UNSH";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(((com.google.javascript.jscomp.AbstractCompiler)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.Normalize(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }
}
