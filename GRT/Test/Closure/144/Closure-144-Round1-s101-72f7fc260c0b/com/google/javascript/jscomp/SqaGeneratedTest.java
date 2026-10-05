package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.JSDocInfo();
    Object v2 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v0).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v1));
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
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getTopScope();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).getTypeNodes();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = ".";
    Object v15 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferReturnStatements(((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = ((com.google.javascript.rhino.JSDocInfo)v0).getImplementedInterfaces();
    Object v2 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferReturnStatements(((com.google.javascript.rhino.Node)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ".";
    Object v19 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferThisType(((com.google.javascript.rhino.JSDocInfo)v17),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = ".";
    Object v21 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnStatements(((com.google.javascript.rhino.Node)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = ".";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = ",G";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "norm^alize";
    ((com.google.javascript.rhino.JSDocInfo)v22).setLicense(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ".";
    Object v26 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferThisType(((com.google.javascript.rhino.JSDocInfo)v24),((com.google.javascript.rhino.Node)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.JSDocInfo();
    Object v1 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(((com.google.javascript.rhino.JSDocInfo)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = ".";
    Object v20 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnStatements(((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "norm^alize";
    ((com.google.javascript.rhino.JSDocInfo)v22).setLicense(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ".";
    Object v28 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferThisType(((com.google.javascript.rhino.JSDocInfo)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "prototy";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "norm^alize";
    ((com.google.javascript.rhino.JSDocInfo)v22).setLicense(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ".";
    Object v28 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isQualifiedName();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferThisType(((com.google.javascript.rhino.JSDocInfo)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).buildAndRegister();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    ((com.google.javascript.rhino.Node)v23).detachChildren();
    Object v24 = null;
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = "l";
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v19).hasParameter(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "norm^alize";
    ((com.google.javascript.rhino.JSDocInfo)v22).setLicense(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v26 = ".";
    Object v27 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferReturnStatements(((com.google.javascript.rhino.Node)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = "l";
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v19).hasParameter(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v23 = new com.google.javascript.rhino.JSDocInfo();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v22).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = ".";
    Object v22 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferReturnStatements(((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "_";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "goog.getCssName";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "$";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getVar(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = "@";
    Object v6 = -45;
    Object v7 = ((com.google.javascript.jscomp.SourceExcerptProvider)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ".";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),((com.google.javascript.jscomp.Scope)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v27));
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v28).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = ".";
    Object v22 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferReturnStatements(((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.rhino.JSDocInfo)v30).getImplementedInterfaces();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "4";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "\n";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "*";
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.Scope)v11).isDeclared(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.rhino.JSDocInfo)v30).getImplementedInterfaces();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v33 = ".";
    Object v34 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.rhino.Node)v34).removeChildren();
    Object v36 = new com.google.javascript.rhino.JSDocInfo();
    Object v37 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferParameterTypes(((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.JSDocInfo)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = ".";
    Object v20 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnStatements(((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = "l";
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v19).hasParameter(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v23 = new com.google.javascript.rhino.JSDocInfo();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v22).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v23));
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v24).buildAndRegister();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = ".";
    Object v27 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isQualifiedName();
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferParameterTypes(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.JSDocInfo)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = ".";
    Object v21 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.JSDocInfo)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = ".";
    Object v21 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferParameterTypes(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.rhino.JSDocInfo)v24).getParameterCount();
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = false;
    ((com.google.javascript.rhino.JSDocInfo)v24).setDeprecated((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = ".";
    Object v28 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferThisType(((com.google.javascript.rhino.JSDocInfo)v24),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.rhino.JSDocInfo)v21).getImplementedInterfaces();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v27));
    Object v29 = ".";
    Object v30 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.rhino.JSDocInfo)v31).getParameterCount();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v28).inferParameterTypes(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnStatements(((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "m";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "WHILE node";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    ((com.google.javascript.jscomp.AbstractCompiler)v4).reportCodeChange();
    Object v5 = null;
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferThisType(((com.google.javascript.rhino.JSDocInfo)v16),((com.google.javascript.rhino.Node)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "W";
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v24).hasParameter(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.rhino.JSDocInfo)v21).getImplementedInterfaces();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = ".";
    Object v27 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isQualifiedName();
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferParameterTypes(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.JSDocInfo)v29));
    Object v31 = ".";
    Object v32 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v31));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferParameterTypes(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = ".";
    Object v23 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.rhino.JSDocInfo)v30).getImplementedInterfaces();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v29).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v30));
    Object v33 = new com.google.javascript.rhino.JSDocInfo();
    Object v34 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v32).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.rhino.JSDocInfo)v21).getImplementedInterfaces();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = ".";
    Object v29 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.JSDocInfo)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.rhino.JSDocInfo)v16).getImplementedInterfaceCount();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v27));
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v28).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.rhino.JSDocInfo)v21).getImplementedInterfaces();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = ".";
    Object v29 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v28));
    Object v30 = new com.google.javascript.rhino.JSDocInfo();
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.JSDocInfo)v30));
    Object v32 = new com.google.javascript.rhino.JSDocInfo();
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v31).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v22).buildAndRegister();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "M";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "9";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "=";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getSlot(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = ".";
    Object v27 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isQualifiedName();
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferParameterTypes(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.JSDocInfo)v29));
    Object v31 = ".";
    Object v32 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferReturnStatements(((com.google.javascript.rhino.Node)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "arguments";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "[";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = "W";
    Object v26 = ((com.google.javascript.rhino.JSDocInfo)v24).hasParameter(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v28 = ".";
    Object v29 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).cloneNode();
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.rhino.JSDocInfo)v21).getImplementedInterfaces();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferParameterTypes(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ".";
    Object v30 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.Node)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.rhino.JSDocInfo)v22).getImplementedInterfaceCount();
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferThisType(((com.google.javascript.rhino.JSDocInfo)v22),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v23 = new com.google.javascript.rhino.JSDocInfo();
    Object v24 = ".";
    Object v25 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v22).inferThisType(((com.google.javascript.rhino.JSDocInfo)v23),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = "norm^alize";
    ((com.google.javascript.rhino.JSDocInfo)v22).setLicense(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ".";
    Object v20 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferThisType(((com.google.javascript.rhino.JSDocInfo)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ".";
    Object v30 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferThisType(((com.google.javascript.rhino.JSDocInfo)v28),((com.google.javascript.rhino.Node)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.rhino.JSDocInfo)v16).getImplementedInterfaceCount();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ".";
    Object v28 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferThisType(((com.google.javascript.rhino.JSDocInfo)v26),((com.google.javascript.rhino.Node)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = ".";
    Object v27 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isQualifiedName();
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    Object v30 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferParameterTypes(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.JSDocInfo)v29));
    Object v31 = new com.google.javascript.rhino.JSDocInfo();
    Object v32 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v30).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = "l";
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v19).hasParameter(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v23 = new com.google.javascript.rhino.JSDocInfo();
    Object v24 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v22).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "continu";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = "NEG";
    Object v8 = ".";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getOwnSlot(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7),((com.google.javascript.jscomp.Scope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.rhino.JSDocInfo)v16).getImplementedInterfaceCount();
    Object v18 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v18).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v20).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ".";
    Object v6 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v5));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setIsSyntheticBlock((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = "argumens";
    Object v10 = ".";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v6),((java.lang.String)v9),((com.google.javascript.jscomp.Scope)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "T";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v14 = new com.google.javascript.rhino.JSDocInfo();
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v14).getParameterCount();
    Object v16 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v13).inferTemplateTypeName(((com.google.javascript.rhino.JSDocInfo)v14));
    Object v17 = ".";
    Object v18 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v16).setSourceNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    Object v23 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v21).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v24 = new com.google.javascript.rhino.JSDocInfo();
    Object v25 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v23).inferInheritance(((com.google.javascript.rhino.JSDocInfo)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v25).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    Object v29 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v27).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = ".";
    Object v7 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v6));
    Object v8 = "!";
    Object v9 = ".";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "Y";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getSlot(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.FunctionTypeBuilder(((java.lang.String)v0),((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.jscomp.Scope)v12));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    Object v17 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v15).inferParameterTypes(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v18 = new com.google.javascript.rhino.JSDocInfo();
    Object v19 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v17).inferReturnType(((com.google.javascript.rhino.JSDocInfo)v18));
    Object v20 = ".";
    Object v21 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.FunctionTypeBuilder)v19).setSourceNode(((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertNotNull(v22);
  }
}
