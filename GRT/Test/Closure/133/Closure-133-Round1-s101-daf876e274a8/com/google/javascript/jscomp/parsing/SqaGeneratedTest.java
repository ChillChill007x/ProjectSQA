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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v14);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getSourceFileName();
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v18);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.EOF;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parse();
    org.junit.Assert.assertEquals((Object)(false), v14);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setWasEmptyNode((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).createJSTypeExpression(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v14);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.RB;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parse();
    org.junit.Assert.assertEquals((Object)(false), v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = "\"";
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v14));
    Object v16 = 48;
    Object v17 = 24;
    Object v18 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v19 = "b";
    Object v20 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v18),((java.lang.String)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v27 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v15),((com.google.javascript.rhino.head.ast.Comment)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.rhino.head.ErrorReporter)v26));
    Object v28 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v27).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = "\"";
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v16));
    Object v18 = 48;
    Object v19 = 24;
    Object v20 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v21 = "b";
    Object v22 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v20),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getQualifiedName();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v30 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v17),((com.google.javascript.rhino.head.ast.Comment)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.parsing.Config)v28),((com.google.javascript.rhino.head.ErrorReporter)v29));
    Object v31 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v30).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.LB;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = "\"";
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v14));
    Object v16 = 48;
    Object v17 = 24;
    Object v18 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v19 = "b";
    Object v20 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v18),((java.lang.String)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = ((com.google.javascript.rhino.Node)v23).getQualifiedName();
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v15),((com.google.javascript.rhino.head.ast.Comment)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = "\"";
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v15));
    Object v17 = 48;
    Object v18 = 24;
    Object v19 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v20 = "b";
    Object v21 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v19),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v16),((com.google.javascript.rhino.head.ast.Comment)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v29 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v28).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.LP;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNotNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.LT;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.STRING;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNotNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.RP;
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseInlineTypeDoc();
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v15);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v20);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = com.google.javascript.jscomp.parsing.JsDocToken.EOF;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v14));
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v20);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.jscomp.parsing.JsDocToken.LC;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v17));
    org.junit.Assert.assertNull(v18);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = com.google.javascript.jscomp.parsing.JsDocToken.LP;
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v20));
    org.junit.Assert.assertNull(v21);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = "\"";
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v15));
    Object v17 = 48;
    Object v18 = 24;
    Object v19 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v20 = "b";
    Object v21 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v19),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v28 = "";
    Object v29 = "R";
    Object v30 = 1;
    Object v31 = ">";
    Object v32 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v27).error(((java.lang.String)v28),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()));
    Object v33 = null;
    Object v34 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v16),((com.google.javascript.rhino.head.ast.Comment)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.rhino.head.ErrorReporter)v27));
    Object v35 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v34).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = "";
    Object v21 = "Z";
    Object v22 = new java.io.File(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v22),((java.nio.charset.Charset)v23));
    ((com.google.javascript.rhino.Node)v19).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v24));
    Object v25 = null;
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertNotNull(v26);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertNotNull(v23);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "j";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = "\"";
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v20));
    Object v22 = 48;
    Object v23 = 24;
    Object v24 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v25 = "b";
    Object v26 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v24),((java.lang.String)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v33 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v21),((com.google.javascript.rhino.head.ast.Comment)v26),((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.parsing.Config)v31),((com.google.javascript.rhino.head.ErrorReporter)v32));
    Object v34 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v35 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v33).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v34));
    Object v36 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertNotNull(v36);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "j";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v20);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.RP;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "j";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertNotNull(v23);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 28;
    Object v21 = true;
    ((com.google.javascript.rhino.Node)v19).putBooleanProp((((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).createJSTypeExpression(((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertNotNull(v23);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.LC;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNotNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = "\"";
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v20));
    Object v22 = 48;
    Object v23 = 24;
    Object v24 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v25 = "b";
    Object v26 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v24),((java.lang.String)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    Object v30 = false;
    ((com.google.javascript.rhino.Node)v29).setVarArgs((((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v35 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v21),((com.google.javascript.rhino.head.ast.Comment)v26),((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.parsing.Config)v33),((com.google.javascript.rhino.head.ErrorReporter)v34));
    Object v36 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v37 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v35).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v36));
    Object v38 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.STRING;
    Object v22 = ((java.lang.Enum)v21).getDeclaringClass();
    Object v23 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    org.junit.Assert.assertNotNull(v23);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "j";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertNotNull(v24);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v15);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    org.junit.Assert.assertNotNull(v20);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = "\"";
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v14));
    Object v16 = 48;
    Object v17 = 24;
    Object v18 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v19 = "b";
    Object v20 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v18),((java.lang.String)v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v27 = "";
    Object v28 = "j";
    Object v29 = 0;
    Object v30 = "";
    Object v31 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v26).error(((java.lang.String)v27),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v15),((com.google.javascript.rhino.head.ast.Comment)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.rhino.head.ErrorReporter)v26));
    Object v34 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v33).parseInlineTypeDoc();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertNotNull(v24);
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
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = "\"";
    Object v17 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v16));
    Object v18 = 48;
    Object v19 = 24;
    Object v20 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v21 = "b";
    Object v22 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v20),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v29 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v17),((com.google.javascript.rhino.head.ast.Comment)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.rhino.head.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v31 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v29).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v30));
    Object v32 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertNotNull(v32);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "j";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = com.google.javascript.jscomp.parsing.JsDocToken.QMARK;
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    org.junit.Assert.assertNull(v22);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v15));
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setVarArgs((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = com.google.javascript.jscomp.parsing.JsDocToken.RC;
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v17));
    org.junit.Assert.assertNull(v18);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "j";
    Object v15 = 0;
    Object v16 = "";
    Object v17 = -26;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = "\"";
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v20));
    Object v22 = 48;
    Object v23 = 24;
    Object v24 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v25 = "b";
    Object v26 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v24),((java.lang.String)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v33 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v21),((com.google.javascript.rhino.head.ast.Comment)v26),((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.parsing.Config)v31),((com.google.javascript.rhino.head.ErrorReporter)v32));
    Object v34 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v35 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v33).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v34));
    Object v36 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertNotNull(v36);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.EOC;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v17));
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v14 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v13).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v14);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "R";
    Object v15 = 1;
    Object v16 = ">";
    Object v17 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v12).error(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    Object v20 = "\"";
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v20));
    Object v22 = 48;
    Object v23 = 24;
    Object v24 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v25 = "b";
    Object v26 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v24),((java.lang.String)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    Object v30 = ((com.google.javascript.rhino.Node)v29).getQualifiedName();
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v31).booleanValue()));
    Object v33 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v34 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v21),((com.google.javascript.rhino.head.ast.Comment)v26),((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.rhino.head.ErrorReporter)v33));
    Object v35 = com.google.javascript.jscomp.parsing.JsDocToken.STRING;
    Object v36 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v34).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v35));
    Object v37 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertNotNull(v37);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseInlineTypeDoc();
    org.junit.Assert.assertNull(v17);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.EOL;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    org.junit.Assert.assertNull(v16);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = "\"";
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v20));
    Object v22 = 48;
    Object v23 = 24;
    Object v24 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v25 = "b";
    Object v26 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v24),((java.lang.String)v25));
    Object v27 = -15;
    Object v28 = ((com.google.javascript.rhino.head.Node)v26).setType((((java.lang.Integer)v27).intValue()));
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.Node[]{};
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()),((com.google.javascript.rhino.Node[])v30));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v35 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v21),((com.google.javascript.rhino.head.ast.Comment)v26),((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.parsing.Config)v33),((com.google.javascript.rhino.head.ErrorReporter)v34));
    Object v36 = com.google.javascript.jscomp.parsing.JsDocToken.LC;
    Object v37 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v35).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v36));
    Object v38 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).createJSTypeExpression(((com.google.javascript.rhino.Node)v37));
    org.junit.Assert.assertNotNull(v38);
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
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = "\"";
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v15));
    Object v17 = 48;
    Object v18 = 24;
    Object v19 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v20 = "b";
    Object v21 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v19),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = ((com.google.javascript.rhino.Node)v24).getQualifiedName();
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v29 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v16),((com.google.javascript.rhino.head.ast.Comment)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.rhino.head.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.parsing.JsDocToken.STRING;
    Object v31 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v29).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v30));
    Object v32 = ((com.google.javascript.rhino.Node)v31).isLocalResultCall();
    Object v33 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 48;
    Object v3 = 24;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).clonePropsFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = "";
    Object v18 = "\\.";
    Object v19 = -6;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = ((com.google.javascript.rhino.head.ErrorReporter)v16).runtimeError(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    org.junit.Assert.assertNotNull(v23);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getQualifiedName();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.GT;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseInlineTypeDoc();
    Object v21 = com.google.javascript.jscomp.parsing.JsDocToken.EOL;
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v21));
    org.junit.Assert.assertNull(v22);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getLength();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = "\"";
    Object v16 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v15));
    Object v17 = 48;
    Object v18 = 24;
    Object v19 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v20 = "b";
    Object v21 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v19),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = ((com.google.javascript.rhino.Node)v24).getQualifiedName();
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v29 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v16),((com.google.javascript.rhino.head.ast.Comment)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.rhino.head.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.parsing.JsDocToken.STRING;
    Object v31 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v29).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v30));
    Object v32 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).createJSTypeExpression(((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertNotNull(v32);
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
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v6).hasSideEffects();
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parseInlineTypeDoc();
    Object v16 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v14).parse();
    org.junit.Assert.assertEquals((Object)(false), v16);
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
    Object v7 = 48;
    Object v8 = 24;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v6).addChildrenToFront(((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.rhino.head.ErrorReporter)v18));
    Object v20 = com.google.javascript.jscomp.parsing.JsDocToken.STAR;
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isNoSideEffectsCall();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
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
    Object v7 = -15;
    Object v8 = ((com.google.javascript.rhino.head.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    Object v16 = com.google.javascript.jscomp.parsing.JsDocToken.RP;
    Object v17 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v15).parseAndRecordTypeNode(((com.google.javascript.jscomp.parsing.JsDocToken)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).clonePropsFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = "";
    Object v18 = "\\.";
    Object v19 = -6;
    Object v20 = "";
    Object v21 = 0;
    Object v22 = ((com.google.javascript.rhino.head.ErrorReporter)v16).runtimeError(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v23).createJSTypeExpression(((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertNotNull(v27);
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
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneNode();
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.rhino.head.ast.Comment)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }
}
