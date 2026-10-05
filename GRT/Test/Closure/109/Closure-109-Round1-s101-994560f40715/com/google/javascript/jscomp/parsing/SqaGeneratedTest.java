package com.google.javascript.jscomp.parsing;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).createJSTypeExpression(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v15).removeProp((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).createJSTypeExpression(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.RP;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.LB;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.RB;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = "\"";
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v14));
    Object v16 = 48;
    Object v17 = 24;
    Object v18 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v19 = "b";
    Object v20 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v18),((java.lang.String)v19));
    Object v21 = com.google.javascript.rhino.IR.continueNode();
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v27 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v15),((com.google.javascript.rhino.head.ast.Comment)v20),((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.rhino.head.ErrorReporter)v26));
    Object v28 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v27).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = "\"";
    Object v18 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v17));
    Object v19 = 48;
    Object v20 = 24;
    Object v21 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v22 = "b";
    Object v23 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v21),((java.lang.String)v22));
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    Object v25 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v24).addChildToFront(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = false;
    Object v28 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v27).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v32 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v18),((com.google.javascript.rhino.head.ast.Comment)v23),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.parsing.Config)v30),((com.google.javascript.rhino.head.ErrorReporter)v31));
    Object v33 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v32).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.jscomp.parsing.JsDocToken.LB;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = "\"";
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v16));
    Object v18 = 48;
    Object v19 = 24;
    Object v20 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v21 = "b";
    Object v22 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v20),((java.lang.String)v21));
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v23).addChildToFront(((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v31 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v17),((com.google.javascript.rhino.head.ast.Comment)v22),((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.parsing.Config)v29),((com.google.javascript.rhino.head.ErrorReporter)v30));
    Object v32 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v31).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = "\"";
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v15));
    Object v17 = 48;
    Object v18 = 24;
    Object v19 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v20 = "b";
    Object v21 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v19),((java.lang.String)v20));
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v16),((com.google.javascript.rhino.head.ast.Comment)v21),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.LP;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.LT;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
    Object v17 = ((java.lang.Enum)v16).getDeclaringClass();
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.EOC;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = ((com.google.javascript.rhino.Node)v16).getStaticSourceFile();
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "g";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.jscomp.parsing.JsDocToken.RC;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.jscomp.parsing.JsDocToken.EOF;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.ANNOTATION;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = null;
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).setFileLevelJsDocBuilder(((com.google.javascript.rhino.Node.FileLevelJsDocBuilder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = com.google.javascript.rhino.IR.continueNode();
    Object v21 = com.google.javascript.rhino.IR.continueNode();
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    Object v25 = com.google.javascript.rhino.IR.continueNode();
    Object v26 = java.util.Set.of(((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25));
    ((com.google.javascript.rhino.Node)v20).setDirectives(((java.util.Set)v26));
    Object v27 = null;
    Object v28 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = "g";
    Object v21 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = ":";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v7));
    Object v9 = 48;
    Object v10 = 24;
    Object v11 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v12 = "b";
    Object v13 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v11),((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = false;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v8),((com.google.javascript.rhino.head.ast.Comment)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.Node)v6).removeChildren();
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v7));
    Object v9 = 48;
    Object v10 = 24;
    Object v11 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v12 = "b";
    Object v13 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v11),((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = false;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v8),((com.google.javascript.rhino.head.ast.Comment)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = com.google.javascript.rhino.IR.continueNode();
    Object v30 = 0;
    Object v31 = ((com.google.javascript.rhino.Node)v29).getAncestor((((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).createJSTypeExpression(((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = "g";
    Object v17 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = 1;
    ((com.google.javascript.rhino.Node)v17).setSourceEncodedPositionForTree((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.EOF;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v7));
    Object v9 = 48;
    Object v10 = 24;
    Object v11 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v12 = "b";
    Object v13 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v11),((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = false;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v8),((com.google.javascript.rhino.head.ast.Comment)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).parse();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.BANG;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = ((com.google.javascript.rhino.Node)v16).removeFirstChild();
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.jscomp.parsing.JsDocToken.LT;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.Node)v6).removeChildren();
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = "\"";
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v15));
    Object v17 = 48;
    Object v18 = 24;
    Object v19 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v20 = "b";
    Object v21 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v19),((java.lang.String)v20));
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v16),((com.google.javascript.rhino.head.ast.Comment)v21),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).parseInlineTypeDoc();
    Object v30 = ((com.google.javascript.rhino.JSDocInfo)v29).getTypeNodes();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v29));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = "g";
    Object v17 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v7));
    Object v9 = 48;
    Object v10 = 24;
    Object v11 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v12 = "b";
    Object v13 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v11),((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = false;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v8),((com.google.javascript.rhino.head.ast.Comment)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = "g";
    Object v30 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).createJSTypeExpression(((com.google.javascript.rhino.Node)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.Node)v6).removeChildren();
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).createJSTypeExpression(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setVarArgs((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = "g";
    Object v17 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = -6;
    ((com.google.javascript.rhino.Node)v17).setLineno((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = "\"";
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v16));
    Object v18 = 48;
    Object v19 = 24;
    Object v20 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v21 = "b";
    Object v22 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v20),((java.lang.String)v21));
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v24).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v29 = "";
    Object v30 = "7";
    Object v31 = 0;
    Object v32 = "$";
    Object v33 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v28).warning(((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()));
    Object v34 = null;
    Object v35 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v17),((com.google.javascript.rhino.head.ast.Comment)v22),((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.rhino.head.ErrorReporter)v28));
    Object v36 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v35).parseInlineTypeDoc();
    Object v37 = ((com.google.javascript.rhino.JSDocInfo)v36).getImplementedInterfaces();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v36));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.Node)v6).removeChildren();
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parse();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "7";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = "\"";
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v16));
    Object v18 = 48;
    Object v19 = 24;
    Object v20 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v21 = "b";
    Object v22 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v20),((java.lang.String)v21));
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    Object v25 = ((com.google.javascript.rhino.Node)v23).checkTreeEquals(((com.google.javascript.rhino.Node)v24));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v31 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v17),((com.google.javascript.rhino.head.ast.Comment)v22),((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.parsing.Config)v29),((com.google.javascript.rhino.head.ErrorReporter)v30));
    Object v32 = com.google.javascript.jscomp.parsing.JsDocToken.BANG;
    Object v33 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v31).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v32));
    Object v34 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v7));
    Object v9 = 48;
    Object v10 = 24;
    Object v11 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v12 = "b";
    Object v13 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v11),((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = false;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v8),((com.google.javascript.rhino.head.ast.Comment)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    ((com.google.javascript.rhino.Node)v8).setDirectives(((java.util.Set)v14));
    Object v15 = null;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.rhino.head.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.BANG;
    Object v22 = ((java.lang.Enum)v21).getDeclaringClass();
    Object v23 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 0;
    ((com.google.javascript.rhino.head.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "7";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 0;
    ((com.google.javascript.rhino.head.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "7";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v17).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "7";
    Object v15 = 0;
    Object v16 = "$";
    Object v17 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).warning(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = com.google.javascript.jscomp.parsing.JsDocToken.EOF;
    Object v21 = ((java.lang.Enum)v20).hashCode();
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 0;
    ((com.google.javascript.rhino.head.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "7";
    Object v11 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v10));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v17).createJSTypeExpression(((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.head.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v16);
  }
}
