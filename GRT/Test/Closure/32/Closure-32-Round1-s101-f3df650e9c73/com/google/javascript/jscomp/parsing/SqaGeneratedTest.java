package com.google.javascript.jscomp.parsing;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v20).getTypeNodes();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    ((com.google.javascript.rhino.head.Node)v6).addChildToBack(((com.google.javascript.rhino.head.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v10 = "arguments";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v9),((com.google.javascript.rhino.jstype.StaticSourceFile)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.rhino.head.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    ((com.google.javascript.rhino.head.Node)v6).addChildToBack(((com.google.javascript.rhino.head.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v10 = "arguments";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v9),((com.google.javascript.rhino.jstype.StaticSourceFile)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.rhino.head.ErrorReporter)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v21).parse();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getQualifiedName();
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = -9;
    ((com.google.javascript.rhino.Node)v15).setLength((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.rhino.head.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = -9;
    ((com.google.javascript.rhino.Node)v15).setLength((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.rhino.head.ErrorReporter)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v21).parse();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "y";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.head.ast.AstRoot();
    Object v8 = "arguments";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v7),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getQualifiedName();
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parse();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 19;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 19;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parse();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).parse();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "\"";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "nul";
    Object v15 = "RgExp";
    Object v16 = -43;
    Object v17 = "*";
    Object v18 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "nul";
    Object v15 = "RgExp";
    Object v16 = -43;
    Object v17 = "*";
    Object v18 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "nul";
    Object v15 = "RgExp";
    Object v16 = -43;
    Object v17 = "*";
    Object v18 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parse();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 32;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = "\"";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).checkTreeEquals(((com.google.javascript.rhino.Node)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = "~";
    Object v18 = "h";
    Object v19 = 0;
    Object v20 = "]";
    Object v21 = 36;
    ((com.google.javascript.rhino.head.ErrorReporter)v16).error(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v8).detachChildren();
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.head.ast.AstNode)v6).compareTo(((com.google.javascript.rhino.head.ast.AstNode)v11));
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "nul";
    Object v15 = "RgExp";
    Object v16 = -43;
    Object v17 = "*";
    Object v18 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "URI_ERROR_TYPE";
    Object v13 = "";
    Object v14 = -11;
    Object v15 = "%";
    Object v16 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).shortName();
    Object v8 = "y";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v8).detachChildren();
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).shortName();
    Object v8 = "y";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parse();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v8).detachChildren();
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).toSource();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = "\"";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).toSource();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = "\"";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v16).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).shortName();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 32;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = "\"";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).checkTreeEquals(((com.google.javascript.rhino.Node)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = "~";
    Object v18 = "h";
    Object v19 = 0;
    Object v20 = "]";
    Object v21 = 36;
    ((com.google.javascript.rhino.head.ErrorReporter)v16).error(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v24 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v23).parse();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).shortName();
    Object v8 = "y";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.head.ast.AstNode)v6).compareTo(((com.google.javascript.rhino.head.ast.AstNode)v11));
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "nul";
    Object v15 = "RgExp";
    Object v16 = -43;
    Object v17 = "*";
    Object v18 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.head.ast.AstNode)v6).compareTo(((com.google.javascript.rhino.head.ast.AstNode)v11));
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).parse();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "d";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "prototpe";
    Object v13 = "k";
    Object v14 = 0;
    Object v15 = "";
    Object v16 = 1;
    Object v17 = ((com.google.javascript.rhino.head.ErrorReporter)v11).runtimeError(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.AstNode)v6).makeIndent((((java.lang.Integer)v7).intValue()));
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getDirectives();
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "y";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "nul";
    Object v15 = "RgExp";
    Object v16 = -43;
    Object v17 = "*";
    Object v18 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 32;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = "\"";
    Object v12 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).checkTreeEquals(((com.google.javascript.rhino.Node)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = "~";
    Object v18 = "h";
    Object v19 = 0;
    Object v20 = "]";
    Object v21 = 36;
    ((com.google.javascript.rhino.head.ErrorReporter)v16).error(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v24 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v23).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).parse();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.head.ast.AstNode)v6).compareTo(((com.google.javascript.rhino.head.ast.AstNode)v11));
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeFirstChild();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isLocalResultCall();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).toSource();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = "\"";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v16).parse();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "'\n";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = "Q";
    Object v16 = 27;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).setJsDocNode(((com.google.javascript.rhino.head.ast.Comment)v11));
    Object v12 = null;
    Object v13 = "y";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = "";
    Object v19 = "N";
    Object v20 = 0;
    Object v21 = "this";
    Object v22 = 43;
    Object v23 = ((com.google.javascript.rhino.head.ErrorReporter)v17).runtimeError(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).setJsDocNode(((com.google.javascript.rhino.head.ast.Comment)v11));
    Object v12 = null;
    Object v13 = "y";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = "";
    Object v19 = "N";
    Object v20 = 0;
    Object v21 = "this";
    Object v22 = 43;
    Object v23 = ((com.google.javascript.rhino.head.ErrorReporter)v17).runtimeError(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    Object v25 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v24).parse();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "3";
    Object v13 = "Functio";
    Object v14 = 27;
    Object v15 = "";
    Object v16 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = ",";
    Object v16 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).error(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = "\"";
    Object v14 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = ",";
    Object v16 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).error(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "URI_ERROR_TYPE";
    Object v13 = "";
    Object v14 = -11;
    Object v15 = "%";
    Object v16 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).parse();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isLocalResultCall();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = "d";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parse();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = ",";
    Object v16 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).error(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).parse();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = ",";
    Object v16 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).error(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "prototpe";
    Object v13 = "k";
    Object v14 = 0;
    Object v15 = "";
    Object v16 = 1;
    Object v17 = ((com.google.javascript.rhino.head.ErrorReporter)v11).runtimeError(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).parse();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "'\n";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = "Q";
    Object v16 = 27;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).parse();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).toSource();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "\"";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).toSource();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "'\n";
    Object v13 = "";
    Object v14 = 1;
    Object v15 = "Q";
    Object v16 = 27;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).shortName();
    Object v8 = "\"";
    Object v9 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = "d";
    Object v10 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = 0;
    ((com.google.javascript.rhino.Node)v8).setCharno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    Object v14 = "y";
    Object v15 = ((com.google.javascript.rhino.JSDocInfo)v13).getDescriptionForParameter(((java.lang.String)v14));
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getIntProp((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "@";
    Object v15 = "DEFAULT";
    Object v16 = -13;
    Object v17 = "this<";
    Object v18 = 1;
    Object v19 = ((com.google.javascript.rhino.head.ErrorReporter)v13).runtimeError(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).children();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "K";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "K";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "d";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "3";
    Object v13 = "Functio";
    Object v14 = 27;
    Object v15 = "";
    Object v16 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v18).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "K";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    Object v14 = ((com.google.javascript.rhino.JSDocInfo)v13).getExtendedInterfaces();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v12).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "K";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = 52;
    ((com.google.javascript.rhino.Node)v8).removeProp((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = "";
    Object v15 = "prototype";
    Object v16 = -13;
    Object v17 = "2";
    Object v18 = -16;
    ((com.google.javascript.rhino.head.ErrorReporter)v13).error(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).children();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }
}
