package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v2 = "_";
    Object v3 = 1;
    Object v4 = -14;
    Object v5 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v6 = "v";
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"|","^"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v1).formatWarning(((com.google.javascript.jscomp.JSError)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v2 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v1).setColorize((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: WARNING - \n"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    Object v11 = "_";
    Object v12 = 1;
    Object v13 = -14;
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = "v";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"|","^"};
    Object v19 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = ((com.google.javascript.jscomp.JSError)v19).hashCode();
    Object v21 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v19));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.JSError)v9).toString();
    Object v11 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: WARNING - \n"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.MessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    Object v11 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.JSError)v9).toString();
    Object v11 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v2 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v1).setColorize((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v1).setColorize((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_re";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "[]\n/";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "[]\n/";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "c";
    Object v4 = -14;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1).get(((com.google.javascript.jscomp.SourceExcerptProvider)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)v5));
    Object v7 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = "L";
    Object v11 = -37;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.JSError)v9).equals(((java.lang.Object)v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: WARNING - \n"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    Object v11 = "_";
    Object v12 = 1;
    Object v13 = -14;
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = "v";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"|","^"};
    Object v19 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v19));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = -96;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "_";
    Object v4 = 1;
    Object v5 = -14;
    Object v6 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v7 = "v";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"|","^"};
    Object v11 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CheckLevel)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    Object v12 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v11));
    org.junit.Assert.assertEquals((Object)("_:1: \u001b[31mERROR\u001b[39m - \n"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "_";
    Object v4 = 1;
    Object v5 = -14;
    Object v6 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v7 = "v";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"|","^"};
    Object v11 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CheckLevel)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    Object v12 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v11));
    org.junit.Assert.assertEquals((Object)("_:1: WARNING - \n"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = -96;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v5).setColorize((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = -40;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "functio8 (";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v9));
    Object v11 = "_";
    Object v12 = 1;
    Object v13 = -14;
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = "v";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"|","^"};
    Object v19 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v19));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v4 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v3).setColorize((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v3).formatWarning(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "0H";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v4 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v3).setColorize((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v3).formatError(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = "L";
    Object v11 = -37;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newString(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.JSError)v9).equals(((java.lang.Object)v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = -96;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v5).formatWarning(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_re";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "_";
    Object v8 = 1;
    Object v9 = -14;
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "v";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"|","^"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v4 = "_";
    Object v5 = 1;
    Object v6 = -14;
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = "v";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"|","^"};
    Object v12 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v3).formatWarning(((com.google.javascript.jscomp.JSError)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v3 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v2).setColorize((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v3 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v2).setColorize((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    Object v11 = "_";
    Object v12 = 1;
    Object v13 = -14;
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = "v";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"|","^"};
    Object v19 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v19));
    org.junit.Assert.assertEquals((Object)("_:1: WARNING - \n"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "0H";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "function";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = -40;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "_";
    Object v8 = 1;
    Object v9 = -14;
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "v";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"|","^"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "#";
    Object v4 = 0;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1).get(((com.google.javascript.jscomp.SourceExcerptProvider)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)v5));
    Object v7 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v12 = ((com.google.javascript.jscomp.JSError)v9).format(((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.MessageFormatter)v11));
    Object v13 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "X";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -29;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v2 = "_";
    Object v3 = 1;
    Object v4 = -14;
    Object v5 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v6 = "v";
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"|","^"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v1).formatError(((com.google.javascript.jscomp.JSError)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = -96;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.JSError)v14).hashCode();
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v5).formatError(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "functio8 (";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "[]\n/";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "goog";
    Object v2 = -1;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -29;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v5).setColorize((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = "";
    Object v13 = 0;
    Object v14 = ((com.google.javascript.jscomp.SourceExcerptProvider)v11).getSourceLine(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v11));
    Object v16 = ((com.google.javascript.jscomp.JSError)v9).format(((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.MessageFormatter)v15));
    Object v17 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "_";
    Object v8 = 1;
    Object v9 = -14;
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "v";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"|","^"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "X";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "L";
    Object v2 = -6;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "L";
    Object v2 = -6;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSCompiler_re";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v0).setColorize((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "_";
    Object v4 = 1;
    Object v5 = -14;
    Object v6 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v7 = "v";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"|","^"};
    Object v11 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((com.google.javascript.jscomp.CheckLevel)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    Object v12 = ((com.google.javascript.jscomp.JSError)v11).hashCode();
    Object v13 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v11));
    org.junit.Assert.assertEquals((Object)("_:1: \u001b[31mERROR\u001b[39m - \n"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -32;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = -96;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v5).formatError(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v2 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v1).setColorize((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -56;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v4 = "_";
    Object v5 = 1;
    Object v6 = -14;
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = "v";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"|","^"};
    Object v12 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = ((com.google.javascript.jscomp.JSError)v12).hashCode();
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v3).formatWarning(((com.google.javascript.jscomp.JSError)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "I";
    Object v2 = -7;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "goog";
    Object v2 = -1;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "L";
    Object v2 = -6;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "I";
    Object v2 = -7;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -56;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v2 = "_";
    Object v3 = 1;
    Object v4 = -14;
    Object v5 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v6 = "v";
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"|","^"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = ((com.google.javascript.jscomp.JSError)v10).toString();
    Object v12 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v1).formatWarning(((com.google.javascript.jscomp.JSError)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v4 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v3).setColorize((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v3).formatError(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -32;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = "_";
    Object v7 = 1;
    Object v8 = -14;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "v";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"|","^"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v5).formatError(((com.google.javascript.jscomp.JSError)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "OBJECT_NUMBER_STRING_BOOLEAN";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "NaN";
    Object v4 = -5;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1).get(((com.google.javascript.jscomp.SourceExcerptProvider)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)v5));
    Object v7 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "I";
    Object v2 = -7;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = -96;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    Object v6 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v5).setColorize((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "_";
    Object v9 = 1;
    Object v10 = -14;
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "v";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"|","^"};
    Object v16 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = ((com.google.javascript.jscomp.JSError)v16).hashCode();
    Object v18 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v5).formatWarning(((com.google.javascript.jscomp.JSError)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "_";
    Object v8 = 1;
    Object v9 = -14;
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "v";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"|","^"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "goog";
    Object v2 = -1;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "(";
    Object v2 = -19;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "X";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "goog";
    Object v2 = -1;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "_";
    Object v8 = 1;
    Object v9 = -14;
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "v";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"|","^"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v3 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v2).setColorize((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "X";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatWarning(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v4 = false;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v3).setColorize((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -56;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v9));
    Object v11 = "_";
    Object v12 = 1;
    Object v13 = -14;
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = "v";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"|","^"};
    Object v19 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatWarning(((com.google.javascript.jscomp.JSError)v19));
    org.junit.Assert.assertEquals((Object)("_:1: WARNING - \n"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "#";
    Object v4 = 0;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1).get(((com.google.javascript.jscomp.SourceExcerptProvider)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)v5));
    Object v7 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v8 = "_";
    Object v9 = 1;
    Object v10 = -14;
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "v";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"|","^"};
    Object v16 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v7).formatWarning(((com.google.javascript.jscomp.JSError)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "functio8 (";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = "I";
    Object v13 = -7;
    Object v14 = ((com.google.javascript.jscomp.SourceExcerptProvider)v11).getSourceRegion(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v11));
    Object v16 = ((com.google.javascript.jscomp.JSError)v9).format(((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.MessageFormatter)v15));
    Object v17 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = -14;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "v";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"|","^"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = "";
    Object v13 = -32;
    Object v14 = ((com.google.javascript.jscomp.SourceExcerptProvider)v11).getSourceLine(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v16 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v11),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v15));
    Object v17 = ((com.google.javascript.jscomp.JSError)v9).format(((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.MessageFormatter)v16));
    Object v18 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v0).formatError(((com.google.javascript.jscomp.JSError)v9));
    org.junit.Assert.assertEquals((Object)("_:1: ERROR - \n"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "functio8 (";
    Object v2 = -20;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v4).setColorize((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "_";
    Object v8 = 1;
    Object v9 = -14;
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "v";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"|","^"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "[]\n/";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0));
    Object v5 = "_";
    Object v6 = 1;
    Object v7 = -14;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "v";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"|","^"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v4).formatError(((com.google.javascript.jscomp.JSError)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "#";
    Object v4 = 0;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1).get(((com.google.javascript.jscomp.SourceExcerptProvider)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)v5));
    Object v7 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v8 = true;
    ((com.google.javascript.jscomp.AbstractMessageFormatter)v7).setColorize((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "#";
    Object v4 = 0;
    Object v5 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1).get(((com.google.javascript.jscomp.SourceExcerptProvider)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)v5));
    Object v7 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v0),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v1));
    Object v8 = "_";
    Object v9 = 1;
    Object v10 = -14;
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "v";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"|","^"};
    Object v16 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = ((com.google.javascript.jscomp.JSError)v16).toString();
    Object v18 = ((com.google.javascript.jscomp.LightweightMessageFormatter)v7).formatWarning(((com.google.javascript.jscomp.JSError)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
