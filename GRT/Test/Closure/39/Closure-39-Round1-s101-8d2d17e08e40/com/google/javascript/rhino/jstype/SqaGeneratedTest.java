package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "true";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isSubtype(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = "valuOf";
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = java.util.logging.Logger.getGlobal();
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9),((java.util.logging.Logger)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getJSDocInfo();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "true";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "H";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "function";
    Object v10 = "valuOf";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = java.util.logging.Logger.getGlobal();
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16),((java.util.logging.Logger)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getConstructor();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "Q";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getSlot(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isCheckedUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = "function";
    Object v6 = "valuOf";
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = java.util.logging.Logger.getGlobal();
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12),((java.util.logging.Logger)v13));
    Object v15 = "";
    Object v16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4),((com.google.javascript.rhino.Node)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v2).differsFrom(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "true";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "j";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getOwnPropertyJSDocInfo(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v10).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).getSlot(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorImplementedInterfaces();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getReferenceName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = false;
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).toStringHelper((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("None"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isNoResolvedType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = "valuOf";
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = java.util.logging.Logger.getGlobal();
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9),((java.util.logging.Logger)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v13).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "\"";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "cll";
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = false;
    Object v14 = "function";
    Object v15 = "valuOf";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v22 = java.util.logging.Logger.getGlobal();
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.rhino.head.ErrorReporter)v21),((java.util.logging.Logger)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).defineProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v8),(((java.lang.Boolean)v13).booleanValue()),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "Graph initialized with Zedge annotations turned off";
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v7).isPropertyTypeInferred(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).isPropertyTypeDeclared(((java.lang.String)v4));
    Object v6 = "I";
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).hasProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = false;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ": ";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyNode(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNullable();
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getCtorExtendedInterfaces();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "cll";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "cll";
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).setImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "cll";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).isSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "true";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = "function";
    Object v10 = "valuOf";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = java.util.logging.Logger.getGlobal();
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16),((java.util.logging.Logger)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineInferredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNoResolvedType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "\\r";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getSlot(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = false;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = "cll";
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v16).findPropertyType(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v13).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v4).differsFrom(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "Array";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).removeProperty(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = "function";
    Object v7 = "valuOf";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = java.util.logging.Logger.getGlobal();
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13),((java.util.logging.Logger)v14));
    Object v16 = "";
    Object v17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toDebugHashCodeString();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyTypeInferred(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = "function";
    Object v10 = "valuOf";
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = java.util.logging.Logger.getGlobal();
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16),((java.util.logging.Logger)v17));
    Object v19 = "";
    Object v20 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v2).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getReferenceName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).unboxesTo();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).getIndexType();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "!";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "cll";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).toObjectType();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = "function";
    Object v16 = "valuOf";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v23 = java.util.logging.Logger.getGlobal();
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.rhino.head.ErrorReporter)v22),((java.util.logging.Logger)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.ObjectType)v3).defineInferredProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getOwnPropertyNames();
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "cll";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyTypeInferred(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getReferenceName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = ".";
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = true;
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).setOwnerFunction(((com.google.javascript.rhino.jstype.FunctionType)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "cll";
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isNullable();
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).getCtorExtendedInterfaces();
    Object v11 = new java.util.TreeSet(((java.util.Collection)v10));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).collectPropertyNames(((java.util.Set)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).canBeCalled();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isDateType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = false;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getPropertyNode(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "true";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEmptyType();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = "";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isGlobalThisType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toString();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = "valuOf";
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = java.util.logging.Logger.getGlobal();
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9),((java.util.logging.Logger)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.rhino.jstype.ObjectType)v13).hasOwnProperty(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v13).isUnknownType();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEmptyType();
    Object v11 = "x";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v9).getOwnSlot(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getNormalizedReferenceName();
    Object v5 = "AST should be normalized";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).isPropertyInExterns(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getReferenceName();
    Object v5 = " ";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).isObject();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "cll";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v11));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).setImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getImplicitPrototype();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getReferenceName();
    Object v5 = " ";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).hashCode();
    Object v8 = ":r";
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).isPropertyInExterns(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).getJSDocInfo();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    ((com.google.javascript.rhino.jstype.ObjectType)v2).clearCachedValues();
    Object v3 = null;
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getJSDocInfo();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).unboxesTo();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ".";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "true";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "cll";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).resolve(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v13).getReferenceName();
    Object v15 = " ";
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v13).findPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v9).toObjectType();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "cll";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).hasOwnProperty(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getReferenceName();
    Object v5 = " ";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toAnnotationString();
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "cll";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = "contiue";
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v9).getOwnSlot(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = " ";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v2).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }
}
