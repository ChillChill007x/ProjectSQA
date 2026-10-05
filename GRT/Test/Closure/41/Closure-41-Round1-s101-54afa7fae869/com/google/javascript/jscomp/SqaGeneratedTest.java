package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "i";
    Object v6 = 0;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceRegion(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v8),((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = "$";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "j";
    Object v16 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v16),((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v18));
    Object v20 = "$";
    Object v21 = "";
    Object v22 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v14),((java.lang.String)v15),((com.google.javascript.jscomp.Scope)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "g";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).getSourceName();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "goog$object$create";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "(";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "\"";
    Object v23 = ((com.google.javascript.jscomp.Scope)v21).getSlot(((java.lang.String)v22));
    Object v24 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "null";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "$$";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "N";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "$";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "1";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "%d error(s), %d warning(s), %.1f%% typed%n";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = false;
    Object v13 = false;
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.Node)v11).toString((((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "pro";
    Object v17 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v17),((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v19));
    Object v21 = "$";
    Object v22 = "";
    Object v23 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v16),((com.google.javascript.jscomp.Scope)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = "j";
    ((com.google.javascript.rhino.JSDocInfo)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "String node not created with Node.newString";
    Object v2 = ((com.google.javascript.rhino.JSDocInfo)v0).hasParameterType(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "Objet";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "`";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "B";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferThisType(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "crossModuleMethodM.tion";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "Objct";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "S}";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = " -- ";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "k";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "/";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).putProp((((java.lang.Integer)v12).intValue()),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v16),((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v18));
    Object v20 = "$";
    Object v21 = "";
    Object v22 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v15),((com.google.javascript.jscomp.Scope)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneTree();
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "1";
    Object v2 = ((com.google.javascript.rhino.JSDocInfo)v0).hasDescriptionForParameter(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = " ";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getDeclarativelyUnboundVarsWithoutTypes();
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "$";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    ((com.google.javascript.rhino.JSDocInfo)v0).setAssociatedNode(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "\\";
    Object v6 = 0;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v8),((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = "$";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "h";
    Object v16 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v16),((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v18));
    Object v20 = "$";
    Object v21 = "";
    Object v22 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v14),((java.lang.String)v15),((com.google.javascript.jscomp.Scope)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = ((com.google.javascript.rhino.Node)v11).getIntProp((((java.lang.Integer)v12).intValue()));
    Object v14 = "a";
    Object v15 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v15),((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v17));
    Object v19 = "$";
    Object v20 = "";
    Object v21 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v14),((com.google.javascript.jscomp.Scope)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "Bdeprecated";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "1";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "H";
    Object v23 = true;
    Object v24 = ((com.google.javascript.jscomp.Scope)v21).isDeclared(((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "prototype";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ">";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "*";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "NULL_TYPE";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "$";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    Object v9 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferParameterTypes(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.JSDocInfo)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v12),((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = "$";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v11).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v18));
    Object v20 = "q";
    Object v21 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v21),((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v23));
    Object v25 = "$";
    Object v26 = "";
    Object v27 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v24),((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v20),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "D";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "V";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "M";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "interfaceChecker";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "function";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "m";
    Object v23 = true;
    Object v24 = ((com.google.javascript.jscomp.Scope)v21).isDeclared(((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "m";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "[";
    Object v6 = 0;
    Object v7 = -20;
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v8),((com.google.javascript.jscomp.CheckLevel)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).report(((com.google.javascript.jscomp.JSError)v13));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v15),((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v17));
    Object v19 = "$";
    Object v20 = "";
    Object v21 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.Node)v21).cloneNode();
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v24),((java.io.PrintStream)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v26));
    Object v28 = "$";
    Object v29 = "";
    Object v30 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v27),((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v21),((java.lang.String)v23),((com.google.javascript.jscomp.Scope)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).getParameterCount();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).getThrownTypes();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).getExtendedInterfacesCount();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = "";
    Object v2 = ((com.google.javascript.rhino.JSDocInfo)v0).getParameterType(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v28).mayBeFromExterns();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "<ul>";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "a";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.rhino.JSDocInfo)v28).getTypeNodes();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = "";
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v30).getDescriptionForParameter(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v34).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "]";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v30),((java.io.PrintStream)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v32));
    Object v34 = "$";
    Object v35 = "";
    Object v36 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v33),((java.lang.String)v34),((java.lang.String)v35));
    Object v37 = new com.google.javascript.rhino.JSDocInfo();
    Object v38 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.JSDocInfo)v37));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.rhino.JSDocInfo)v34).containsDeclaration();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v34).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v35));
    Object v37 = new com.google.javascript.rhino.JSDocInfo();
    Object v38 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v36).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.rhino.JSDocInfo)v34).containsDeclaration();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v34));
    Object v37 = new com.google.javascript.rhino.JSDocInfo();
    Object v38 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v36).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "u";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.rhino.JSDocInfo)v28).getSourceName();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferThisType(((com.google.javascript.rhino.JSDocInfo)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "  ";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "=";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v36).mayBeFromExterns();
    Object v38 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v34).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.rhino.JSDocInfo)v36).getExtendedInterfacesCount();
    Object v38 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v34).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v35));
    Object v37 = new com.google.javascript.rhino.JSDocInfo();
    Object v38 = ((com.google.javascript.rhino.JSDocInfo)v37).getSourceName();
    Object v39 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v36).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v37));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.rhino.JSDocInfo)v28).getTypeNodes();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "C";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v13),((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = "$";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),((com.google.javascript.jscomp.Scope)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "Z";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = "$";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v12),((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = "$";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v11).useSourceInfoFrom(((com.google.javascript.rhino.Node)v18));
    Object v20 = "function";
    Object v21 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v21),((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v23));
    Object v25 = "$";
    Object v26 = "";
    Object v27 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v24),((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v11),((java.lang.String)v20),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v31),((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v33));
    Object v35 = "$";
    Object v36 = "";
    Object v37 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v34),((java.lang.String)v35),((java.lang.String)v36));
    Object v38 = new com.google.javascript.rhino.JSDocInfo();
    Object v39 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.Node)v37),((com.google.javascript.rhino.JSDocInfo)v38));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v34).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v35));
    Object v37 = new com.google.javascript.rhino.JSDocInfo();
    Object v38 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v36).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v37));
    Object v39 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v38).buildAndRegister();
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = "";
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v30).getDescriptionForParameter(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getSourceName();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v34 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).setContents(((com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v36));
    Object v38 = new com.google.javascript.rhino.JSDocInfo();
    Object v39 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v37).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = "";
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v30).getDescriptionForParameter(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v34 = new com.google.javascript.rhino.JSDocInfo();
    Object v35 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v33).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v34));
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v35).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferThisType(((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferThisType(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v35 = new com.google.javascript.rhino.JSDocInfo();
    Object v36 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v34).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = "$";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "i";
    Object v14 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v14),((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = "$";
    Object v19 = "";
    Object v20 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(((com.google.javascript.jscomp.AbstractCompiler)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.rhino.JSDocInfo)v30).getThrownTypes();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferThisType(((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v32);
  }
}
