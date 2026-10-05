package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v8).isInvariant(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.jstype.FunctionType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isDict();
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v3).setPrototype(((com.google.javascript.rhino.jstype.ObjectType)v12),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    ((com.google.javascript.rhino.jstype.JSType)v3).clearResolved();
    Object v4 = null;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).isCheckedUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).isInvariant(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v9).toMaybeEnumElementType();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).hasImplementedInterfaces();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.jstype.FunctionType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = "1";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getOwnSlot(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = "\n";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getOwnSlot(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).toStringHelper((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ".";
    Object v10 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.returnNode();
    ((com.google.javascript.rhino.jstype.FunctionType)v4).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v10),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getOwnPropertyNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v8).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isStruct();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ".";
    Object v10 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v8),((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = "";
    Object v15 = "E";
    Object v16 = 0;
    Object v17 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v13).warning(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v10).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "`";
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTypeOfThis();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toObjectType();
    Object v11 = com.google.javascript.rhino.IR.returnNode();
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v3).defineInferredProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v10),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasAnyTemplate();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).isNoObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).equals(((java.lang.Object)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getTypeOfThis();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = ".";
    Object v21 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v19),((java.lang.String)v20));
    Object v22 = false;
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v21).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = "";
    Object v26 = "E";
    Object v27 = 0;
    Object v28 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v24).warning(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = false;
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.FunctionType)v21).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v24),((com.google.javascript.rhino.jstype.StaticScope)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v15).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v34));
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v15).autobox();
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v8).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ".";
    Object v10 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v8),((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = "";
    Object v15 = "E";
    Object v16 = 0;
    Object v17 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v13).warning(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v10).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).makesDicts();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getSuperClassConstructor();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.rhino.jstype.FunctionType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = "JSC_EXPECTD_THIS_TYPE";
    Object v21 = "/";
    Object v22 = 19;
    Object v23 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v19).warning(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v18).resolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = "JSC_EXPECTD_THIS_TYPE";
    Object v21 = "/";
    Object v22 = 19;
    Object v23 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v19).warning(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v18).resolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v28));
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v29).autoboxesTo();
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getParametersNode();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getAllExtendedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getImplementedInterfaces();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getPrototype();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isDict();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getReturnType();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getPrototype();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ".";
    Object v4 = com.google.javascript.rhino.IR.returnNode();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.IR.returnNode();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ".";
    Object v14 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v12),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getReturnType();
    Object v16 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = false;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionType)v20).getTypeOfThis();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).toObjectType();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).autobox();
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = false;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.FunctionType)v27).getTypeOfThis();
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v28).toObjectType();
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionType)v29).getImplementedInterfaces();
    Object v31 = false;
    Object v32 = false;
    Object v33 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ArrowType)v16),((com.google.javascript.rhino.jstype.ObjectType)v23),((com.google.common.collect.ImmutableList)v30),(((java.lang.Boolean)v31).booleanValue()),(((java.lang.Boolean)v32).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getParameters();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getExtendedInterfacesCount();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ".";
    Object v11 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v9),((java.lang.String)v10));
    Object v12 = false;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = "";
    Object v16 = "E";
    Object v17 = 0;
    Object v18 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v14).warning(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionType)v24).getPrototype();
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v8).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getTypeOfThis();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v10 = com.google.javascript.rhino.IR.returnNode();
    ((com.google.javascript.rhino.jstype.FunctionType)v3).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.returnNode();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ".";
    Object v9 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getReturnType();
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getExtendedInterfacesCount();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v8).makesStructs();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getIndexType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getTypeOfThis();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getImplementedInterfaces();
    Object v14 = ((java.util.Collection)v13).stream();
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setExtendedInterfaces(((java.util.List)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = "";
    Object v10 = "E";
    Object v11 = 0;
    Object v12 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getPrototype();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.IR.returnNode();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = false;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ".";
    Object v18 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getReturnType();
    Object v20 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v20).equals(((java.lang.Object)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.returnNode();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ".";
    Object v9 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getReturnType();
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getTypeOfThis();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).autobox();
    Object v19 = "T";
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getPropertyType(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v11).differsFrom(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getPrototype();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getReturnType();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getTypeOfThis();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = "T";
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getParametersNode();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v6).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.returnNode();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ".";
    Object v9 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getReturnType();
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).hasImplementedInterfaces();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getOwnPropertyNames();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasAnyTemplateInternal();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ".";
    Object v11 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v9),((java.lang.String)v10));
    Object v12 = false;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = "";
    Object v16 = "E";
    Object v17 = 0;
    Object v18 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v14).warning(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionType)v24).getPrototype();
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    ((com.google.javascript.rhino.jstype.FunctionType)v27).clearCachedValues();
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.returnNode();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ".";
    Object v9 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getReturnType();
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isStruct();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ".";
    Object v11 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v9),((java.lang.String)v10));
    Object v12 = false;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = "";
    Object v16 = "E";
    Object v17 = 0;
    Object v18 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v14).warning(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionType)v24).getPrototype();
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v28 = ((com.google.javascript.rhino.jstype.FunctionType)v27).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getPrototype();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "eal";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSlot(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getTypeOfThis();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getPrototype();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = "5";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getTopMostDefiningType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getTypeOfThis();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).autobox();
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v18).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = "\n";
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).findPropertyType(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionType)v11).isSubtype(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.returnNode();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ".";
    Object v9 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getReturnType();
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ".";
    Object v11 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.EquivalenceMethod.INVARIANT;
    Object v13 = ((java.lang.Enum)v12).hashCode();
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v5).checkFunctionEquivalenceHelper(((com.google.javascript.rhino.jstype.FunctionType)v11),((com.google.javascript.rhino.jstype.EquivalenceMethod)v12));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toDebugHashCodeString();
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    ((com.google.javascript.rhino.jstype.FunctionType)v8).setSource(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ".";
    Object v10 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v8),((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = "";
    Object v15 = "E";
    Object v16 = 0;
    Object v17 = 0;
    ((com.google.javascript.rhino.ErrorReporter)v13).warning(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v10).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v26 = "EOL";
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionType)v25).getTopMostDefiningType(((java.lang.String)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setDict();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = "L";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    Object v11 = "5";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getTopMostDefiningType(((java.lang.String)v11));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineSynthesizedProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ".";
    Object v5 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v3),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = "5";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getTopMostDefiningType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isGlobalThisType();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = 1;
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getBindReturnType((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    Object v7 = "T";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getTypeOfThis();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).autobox();
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v8).supAndInfHelper(((com.google.javascript.rhino.jstype.FunctionType)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }
}
