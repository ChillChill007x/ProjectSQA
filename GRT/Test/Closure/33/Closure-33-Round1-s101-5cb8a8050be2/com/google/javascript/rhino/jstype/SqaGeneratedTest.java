package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getReferenceName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "I";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyInExterns(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNoType();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "E";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyInExterns(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "2*";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyTypeInferred(((java.lang.String)v3));
    Object v5 = "G";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyNode(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v13).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = "function";
    Object v22 = ".pototype";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "";
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v29 = java.util.logging.Logger.getGlobal();
    Object v30 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v24),((java.lang.String)v25),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.rhino.head.ErrorReporter)v28),((java.util.logging.Logger)v29));
    Object v31 = "";
    Object v32 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((com.google.javascript.rhino.Node)v30),((java.lang.String)v31));
    Object v33 = "@null";
    Object v34 = ((com.google.javascript.rhino.jstype.StaticScope)v32).getSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v18),((com.google.javascript.rhino.jstype.StaticScope)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = "function";
    Object v6 = ".pototype";
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
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v16).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v19));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).setImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ": ";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getSlot(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v13).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isNullable();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).toStringHelper((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = "function";
    Object v6 = ".pototype";
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
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v16).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).toObjectType();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v18).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.ObjectType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).matchConstraint(((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toObjectType();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getMinArguments();
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).setOwnerFunction(((com.google.javascript.rhino.jstype.FunctionType)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toMaybeUnionType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).canBeCalled();
    Object v7 = "\\";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).hasProperty(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "argumeQnts";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getPropertyType(((java.lang.String)v10));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).matchConstraint(((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "~";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).isPropertyTypeDeclared(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getReferenceName();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "k";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getOwnPropertyJSDocInfo(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v10).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toDebugHashCodeString();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v10).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v15).isPropertyTypeInferred(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = "r";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "argumeQnts";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4),((java.lang.String)v5),((com.google.javascript.rhino.jstype.ObjectType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v13).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v2).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).getReferenceName();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "JS property assignmen";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v6));
    Object v8 = "argumeQnts";
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v7).getPropertyType(((java.lang.String)v8));
    Object v10 = "function";
    Object v11 = ".pototype";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = java.util.logging.Logger.getGlobal();
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v13),((java.lang.String)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17),((java.util.logging.Logger)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineDeclaredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "}";
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).isPropertyTypeDeclared(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "\n";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).hasOwnProperty(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isString();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = true;
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).setPrettyPrint((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).isPropertyTypeInferred(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNominalType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = "function";
    Object v9 = ".pototype";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = java.util.logging.Logger.getGlobal();
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v11),((java.lang.String)v12),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15),((java.util.logging.Logger)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineInferredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.Node)v17));
    Object v19 = "";
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = "argumeQnts";
    Object v25 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v23).getPropertyType(((java.lang.String)v24));
    Object v26 = "function";
    Object v27 = ".pototype";
    Object v28 = "";
    Object v29 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v26),((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = "";
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v31).booleanValue()));
    Object v33 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v34 = java.util.logging.Logger.getGlobal();
    Object v35 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v29),((java.lang.String)v30),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.rhino.head.ErrorReporter)v33),((java.util.logging.Logger)v34));
    Object v36 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineInferredProperty(((java.lang.String)v19),((com.google.javascript.rhino.jstype.JSType)v25),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).setImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getJSDocInfo();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = "r";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "argumeQnts";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4),((java.lang.String)v5),((com.google.javascript.rhino.jstype.ObjectType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v2).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasOwnProperty(((java.lang.String)v5));
    Object v7 = "jtring";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).isPropertyTypeDeclared(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = "prototype";
    Object v6 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).setPropertyJSDocInfo(((java.lang.String)v5),((com.google.javascript.rhino.JSDocInfo)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).hasProperty(((java.lang.String)v4));
    Object v6 = "[global]";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getOwnSlot(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ",";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getOwnPropertyJSDocInfo(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "v";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getSlot(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).isSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "}";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = true;
    Object v10 = "function";
    Object v11 = ".pototype";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v18 = java.util.logging.Logger.getGlobal();
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.parse(((com.google.javascript.rhino.jstype.StaticSourceFile)v13),((java.lang.String)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.rhino.head.ErrorReporter)v17),((java.util.logging.Logger)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).defineProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v8),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = "argumeQnts";
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = "r";
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = "argumeQnts";
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((java.lang.String)v6),((com.google.javascript.rhino.jstype.ObjectType)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toObjectType();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v14).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("()"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toString();
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isNullable();
    Object v12 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).unboxesTo();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v16).booleanValue()));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).setOwnerFunction(((com.google.javascript.rhino.jstype.FunctionType)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = "o";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).findPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = "argumeQnts";
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v2).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "r";
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = "Graph initialized w0th edge annotations turned off";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getPropertyType(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = "o";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = "o";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "function";
    Object v3 = ".pototype";
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
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).dereference();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = "Graph initialized w0th edge annotations turned off";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toMaybeFunctionType();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "argumeQnts";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v2),((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = "argumeQnts";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.JSDocInfo();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = "r";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = "argumeQnts";
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "";
    Object v19 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v17).equals(((java.lang.Object)v19));
    Object v21 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v23).toStringHelper((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.JSDocInfo();
    Object v27 = java.util.logging.Logger.getGlobal();
    Object v28 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v20),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v27));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).collectPropertyNames(((java.util.Set)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getReferenceName();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).isSubtype(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = " ";
    Object v6 = "";
    Object v7 = -14;
    Object v8 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = "o";
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v14).findPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toString();
    org.junit.Assert.assertEquals((Object)("None"), v4);
  }
}
