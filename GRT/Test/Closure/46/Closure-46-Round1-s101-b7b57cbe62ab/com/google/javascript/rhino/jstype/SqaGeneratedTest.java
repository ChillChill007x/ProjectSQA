package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "=";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = "}";
    Object v8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineDeclaredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = ";";
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasProperty(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = "E";
    Object v7 = ".";
    Object v8 = 1;
    Object v9 = 34;
    ((com.google.javascript.rhino.ErrorReporter)v5).error(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getOwnPropertyJSDocInfo(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).differsFrom(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "enum{";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyInExterns(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = "}";
    Object v17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v12).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = "}";
    Object v17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toDebugHashCodeString();
    Object v19 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).canBeCalled();
    Object v8 = "a";
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getSlot(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).getNormalizedReferenceName();
    org.junit.Assert.assertEquals((Object)("?"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = "argumeQnts";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasOwnProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).getPossibleToBooleanOutcomes();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toMaybeFunctionType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "protot\"pe";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineInferredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNumber();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "{Synt\"eticVarsDeclar}";
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).setPropertyJSDocInfo(((java.lang.String)v3),((com.google.javascript.rhino.JSDocInfo)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).forceResolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getPropertyNode(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = "goog.tweak.getCompilerOverrides_";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = "\\";
    Object v19 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).isPropertyTypeDeclared(((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = "}";
    Object v9 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v7),((java.lang.String)v8));
    Object v10 = "goog.tweak.getCompilerOverrides_";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v9).dereference();
    Object v13 = true;
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getOwnPropertyJSDocInfo(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isVoidType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v4).differsFrom(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getCtorExtendedInterfaces();
    Object v6 = "\\.pro";
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "\n";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).removeProperty(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).setPropertyJSDocInfo(((java.lang.String)v3),((com.google.javascript.rhino.JSDocInfo)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getJSDocInfo();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).unboxesTo();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).restrictByNotNullOrUndefined();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = java.util.Map.of(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new com.google.javascript.rhino.jstype.RecordType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.util.Map)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getReferenceName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyTypeDeclared(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = "}";
    Object v5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v3),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.RecordType)v0).isSubtype(((com.google.javascript.rhino.jstype.JSType)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorExtendedInterfaces();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v7).differsFrom(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = "number";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getSlot(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toMaybeEnumElementType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).equals(((java.lang.Object)v7));
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = "}";
    Object v15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((com.google.javascript.rhino.Node)v13),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v2).forceResolve(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).getPossibleToBooleanOutcomes();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "/";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEmptyType();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).isPropertyInExterns(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).toString();
    org.junit.Assert.assertEquals((Object)("None"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = "goog.tweak.getCompilerOverrides_";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = "/";
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v17).findPropertyType(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v14).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getJSDocInfo();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ":";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).findPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = "}";
    Object v10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9));
    Object v11 = "goog.tweak.getCompilerOverrides_";
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).findPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v14 = true;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v3).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isDateType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).removeProperty(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).removeProperty(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).matchesInt32Context();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ".";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).hasOwnProperty(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    ((com.google.javascript.rhino.jstype.JSType)v3).clearResolved();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).toString();
    org.junit.Assert.assertEquals((Object)("None"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = "'";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasOwnProperty(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v9).findPropertyType(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyTypeInferred(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.continueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = "}";
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    Object v12 = "goog.tweak.getCompilerOverrides_";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "";
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v16).findPropertyType(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v6).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumber();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "/";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v8).differsFrom(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "/";
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).findPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = "/";
    Object v15 = ((com.google.javascript.rhino.jstype.ObjectType)v13).findPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v9).isUnknownType();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "und!efined";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getOwnSlot(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = "}";
    Object v8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "und!efined";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "/";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "/";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).findPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = "}";
    Object v4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = "goog.tweak.getCompilerOverrides_";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).findPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = "/";
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v16).findPropertyType(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v13).differsFrom(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = "/";
    Object v25 = ((com.google.javascript.rhino.jstype.ObjectType)v23).findPropertyType(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v9).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v9).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autobox();
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = "}";
    Object v8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((com.google.javascript.rhino.Node)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "und!efined";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).isPropertyTypeInferred(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }
}
