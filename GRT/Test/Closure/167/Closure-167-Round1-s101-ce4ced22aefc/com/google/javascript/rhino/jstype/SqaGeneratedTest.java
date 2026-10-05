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
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).collapseUnion();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).collapseUnion();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v3).testForEqualityHelper(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).equals(((java.lang.Object)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v9).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNumber();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).collapseUnion();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isNumber();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v8).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v4).testForEqualityHelper(((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v14);
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
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
    Object v14 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v15 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autoboxesTo();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEmptyType();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toStringHelper((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNullable();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNamedType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toString();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).isString();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isBooleanValueType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasAnyTemplate();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toAnnotationString();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).unboxesTo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).isDateType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).collapseUnion();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).toMaybeEnumElementType();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autobox();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autobox();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).hasAnyTemplate();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v14).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).hasAnyTemplate();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).autobox();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v14).differsFrom(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = false;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((com.google.javascript.rhino.jstype.FunctionType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).toObjectType();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).isFunctionType();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v18).equals(((java.lang.Object)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v9).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toAnnotationString();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toMaybeEnumElementType();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toAnnotationString();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isRegexpType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).hasAnyTemplate();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasAnyTemplate();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v13).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v9).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v9).visit(((com.google.javascript.rhino.jstype.Visitor)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v5).differsFrom(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v15 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v19).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    ((com.google.javascript.rhino.jstype.JSType)v7).clearResolved();
    Object v8 = null;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasAnyTemplate();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.jstype.FunctionType)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = true;
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v20).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toString();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).isStringValueType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).hasAnyTemplate();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = true;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = true;
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v11).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).hasAnyTemplate();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = false;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).hasAnyTemplate();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v20).autobox();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v16).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "(";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v9).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = false;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = false;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v21).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v22),((com.google.javascript.rhino.jstype.StaticScope)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v17).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = false;
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v17).visit(((com.google.javascript.rhino.jstype.Visitor)v32));
    Object v34 = false;
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v33).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v13).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v3).visit(((com.google.javascript.rhino.jstype.Visitor)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).collapseUnion();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v19).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toMaybeParameterizedType();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autobox();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((com.google.javascript.rhino.jstype.FunctionType)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v14).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.rhino.jstype.FunctionType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasAnyTemplate();
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toStringHelper((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v11).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isBooleanObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = "JSCompiler_";
    Object v17 = ((com.google.javascript.rhino.jstype.StaticScope)v15).getOwnSlot(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v8).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v15));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isVoidType();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
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
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNumber();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isNoType();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.rhino.jstype.FunctionType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toObjectType();
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).hasAnyTemplate();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).autobox();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.jstype.FunctionType)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((com.google.javascript.rhino.jstype.FunctionType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = false;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v16),((com.google.javascript.rhino.ErrorReporter)v17),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v7).isSubtype(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.InstanceObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.jstype.FunctionType)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toAnnotationString();
    Object v17 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toMaybeFunctionType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).autobox();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
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
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }
}
