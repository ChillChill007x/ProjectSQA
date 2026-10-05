package com.google.javascript.jscomp.parsing;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "K";
    Object v20 = "call";
    Object v21 = 40;
    Object v22 = "";
    Object v23 = 11;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ",O ";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "K";
    Object v20 = "call";
    Object v21 = 40;
    Object v22 = "";
    Object v23 = 11;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 54;
    Object v8 = ((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = "JSCompiler_renameProperty";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "K";
    Object v20 = "call";
    Object v21 = 40;
    Object v22 = "";
    Object v23 = 11;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "y";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).addChildToFront(((com.google.javascript.jscomp.mozilla.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "prototypV";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = "";
    Object v26 = "";
    Object v27 = 41;
    Object v28 = "";
    Object v29 = 2;
    Object v30 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24).runtimeError(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "prototypea";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 54;
    Object v8 = ((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6).toSource((((java.lang.Integer)v7).intValue()));
    Object v9 = "JSCompiler_renameProperty";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v21).parse();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "ARRAY";
    Object v20 = "V";
    Object v21 = 28;
    Object v22 = "";
    Object v23 = 26;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "ARRAY";
    Object v20 = "V";
    Object v21 = 28;
    Object v22 = "";
    Object v23 = 26;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = ((com.google.javascript.rhino.JSDocInfo)v20).getTypeNodes();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setParent(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v11));
    Object v12 = null;
    Object v13 = "JSCompiler_rena$eProperty";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setParent(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v11));
    Object v12 = null;
    Object v13 = "JSCompiler_rena$eProperty";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setParent(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v11));
    Object v12 = null;
    Object v13 = "JSCompiler_rena$eProperty";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "Property {0} of type {1} has been deprecated: {2}";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "Property {0} of type {1} has been deprecated: {2}";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v21).parse();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "'";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "ARRAY";
    Object v20 = "V";
    Object v21 = 28;
    Object v22 = "";
    Object v23 = 26;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "Property {0} of type {1} has been deprecated: {2}";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v21).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "'";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "'";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = -18;
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = "version";
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v13),((java.util.Set)v16),(((java.lang.Boolean)v17).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v22 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setParent(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v11));
    Object v12 = null;
    Object v13 = "JSCompiler_rena$eProperty";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).toString();
    Object v8 = "Column index m";
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.HashSet(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet(((java.util.Collection)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v11),((java.util.Set)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "'";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setParent(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v11));
    Object v12 = null;
    Object v13 = "JSCompiler_rena$eProperty";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "}";
    Object v21 = -65;
    Object v22 = ", ";
    Object v23 = 3;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).addChildToFront(((com.google.javascript.jscomp.mozilla.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "prototypV";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = "";
    Object v26 = "";
    Object v27 = 41;
    Object v28 = "";
    Object v29 = 2;
    Object v30 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24).runtimeError(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v32 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v31).parse();
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "}";
    Object v21 = -65;
    Object v22 = ", ";
    Object v23 = 3;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "}";
    Object v21 = -65;
    Object v22 = ", ";
    Object v23 = 3;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "o";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "\n";
    Object v21 = 2;
    Object v22 = "g.";
    Object v23 = -9;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = ".p~rototype";
    Object v20 = "8";
    Object v21 = -16;
    Object v22 = "ECMASCRIP43";
    Object v23 = 1;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).error(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = -18;
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = "version";
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v13),((java.util.Set)v16),(((java.lang.Boolean)v17).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v22 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v22).parse();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "line";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "line";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "o";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 0;
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "Property {0} of type {1} has been deprecated: {2}";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v21).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ".";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "arguments";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "o";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "\n";
    Object v21 = 2;
    Object v22 = "g.";
    Object v23 = -9;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).toSource();
    Object v8 = "";
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.HashSet(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet(((java.util.Collection)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v11),((java.util.Set)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = "arguXents";
    Object v21 = "function";
    Object v22 = 0;
    Object v23 = ":";
    Object v24 = 0;
    Object v25 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19).runtimeError(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).toString();
    Object v8 = "Column index m";
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.HashSet(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet(((java.util.Collection)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v11),((java.util.Set)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v20).parse();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "}";
    Object v21 = -65;
    Object v22 = ", ";
    Object v23 = 3;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = ".p~rototype";
    Object v20 = "8";
    Object v21 = -16;
    Object v22 = "ECMASCRIP43";
    Object v23 = 1;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).error(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "jegExp";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "8";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ".";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "~";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = ".p~rototype";
    Object v20 = "8";
    Object v21 = -16;
    Object v22 = "ECMASCRIP43";
    Object v23 = 1;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).error(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "8";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "~";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "\\r";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "8";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "S";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "arguments";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).toSource();
    Object v8 = "";
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.HashSet(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet(((java.util.Collection)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v11),((java.util.Set)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = "arguXents";
    Object v21 = "function";
    Object v22 = 0;
    Object v23 = ":";
    Object v24 = 0;
    Object v25 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19).runtimeError(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v27 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v26).parse();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "S";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\\";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "null";
    Object v20 = "";
    Object v21 = 1;
    Object v22 = "v";
    Object v23 = 0;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "arguments";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "}";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "Graph initialized with edge annotations turned off";
    Object v20 = "{";
    Object v21 = 12;
    Object v22 = "runCustomPaoses";
    Object v23 = 0;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "Unexpected const change.\n  name: ";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "Unexpected const change.\n  name: ";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 91;
    Object v8 = ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).makeIndent((((java.lang.Integer)v7).intValue()));
    Object v9 = "goog.testing.ObjectropertyString";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "V";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "";
    Object v21 = 0;
    Object v22 = "D";
    Object v23 = -10;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).error(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "V";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "";
    Object v21 = 0;
    Object v22 = "D";
    Object v23 = -10;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).error(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "V";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "";
    Object v21 = 0;
    Object v22 = "D";
    Object v23 = -10;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).error(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "}";
    Object v21 = -65;
    Object v22 = ", ";
    Object v23 = 3;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "W";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "W";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ":";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "8";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "\\";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "null";
    Object v20 = "";
    Object v21 = 1;
    Object v22 = "v";
    Object v23 = 0;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).warning(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "v";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "line";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).addChildrenToBack(((com.google.javascript.jscomp.mozilla.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = "";
    Object v26 = "";
    Object v27 = 0;
    Object v28 = "{";
    Object v29 = 1;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24).error(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ":";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "Srray";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 20;
    ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).setRelative((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "";
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet(((java.util.Collection)v11));
    Object v13 = 1;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.HashSet(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v12),((java.util.Set)v15),(((java.lang.Boolean)v16).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v21 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "}";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "Graph initialized with edge annotations turned off";
    Object v20 = "{";
    Object v21 = 12;
    Object v22 = "runCustomPaoses";
    Object v23 = 0;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).setFileOverviewJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "o";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "";
    Object v20 = "\n";
    Object v21 = 2;
    Object v22 = "g.";
    Object v23 = -9;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).getFileOverviewJSDocInfo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ":";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ".";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "v";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).parse();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "}";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = "Graph initialized with edge annotations turned off";
    Object v20 = "{";
    Object v21 = 12;
    Object v22 = "runCustomPaoses";
    Object v23 = 0;
    Object v24 = ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18).runtimeError(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v26 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v25).parse();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "proto'type";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 49;
    Object v8 = 25;
    Object v9 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v10 = "b";
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.mozilla.rhino.Node)v6).addChildrenToBack(((com.google.javascript.jscomp.mozilla.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "";
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v16),((java.util.Set)v19),(((java.lang.Boolean)v20).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v25 = "";
    Object v26 = "";
    Object v27 = 0;
    Object v28 = "{";
    Object v29 = 1;
    ((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24).error(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v32 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v31).parse();
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = "v";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).retrieveAndResetParsedJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).hasSideEffects();
    Object v8 = "";
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.HashSet(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet(((java.util.Collection)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v11),((java.util.Set)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)v6).toSource();
    Object v8 = "\n";
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.HashSet(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet(((java.util.Collection)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v17 = false;
    Object v18 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v11),((java.util.Set)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.google.javascript.jscomp.parsing.JsDocTokenStream(((java.lang.String)v0));
    Object v2 = 49;
    Object v3 = 25;
    Object v4 = com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.HTML;
    Object v5 = "b";
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.mozilla.rhino.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ":";
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.HashSet(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
    Object v16 = false;
    Object v17 = new com.google.javascript.jscomp.parsing.Config(((java.util.Set)v10),((java.util.Set)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = new com.google.javascript.jscomp.parsing.JsDocInfoParser(((com.google.javascript.jscomp.parsing.JsDocTokenStream)v1),((com.google.javascript.jscomp.mozilla.rhino.ast.Comment)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = ((com.google.javascript.jscomp.parsing.JsDocInfoParser)v19).hasParsedJSDocInfo();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }
}
