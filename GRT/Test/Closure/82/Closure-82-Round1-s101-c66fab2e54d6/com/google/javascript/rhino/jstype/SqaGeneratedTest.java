package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).testForEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v3).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    ((com.google.javascript.rhino.jstype.JSType)v3).clearResolved();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).isDateType();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v3).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getDisplayName();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isNamedType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isAllType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).canBeCalled();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = "@modifies may only appear in extern";
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v10).findPropertyType(((java.lang.String)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v8).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).getPossibleToBooleanOutcomes();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "msg.jsdoc.meaning.extra";
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).findPropertyType(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "msg.jsdoc.meaning.extra";
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v14).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).toDebugHashCodeString();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v9).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).differsFrom(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "msg.jsdoc.meaning.extra";
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v3).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v4).isNoObjectType();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).dereference();
    Object v20 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = "msg.jsdoc.meaning.extra";
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = false;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = false;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v22).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = false;
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v28).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = "@modifies may only appear in extern";
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v28).findPropertyType(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v11).testForEqualityHelper(((com.google.javascript.rhino.jstype.JSType)v17),((com.google.javascript.rhino.jstype.JSType)v36));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = false;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = false;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17),((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v12).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v12).unboxesTo();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "msg.jsdoc.meaning.extra";
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).findPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = false;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v16).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = "@modifies may only appear in extern";
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v16).findPropertyType(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "msg.jsdoc.meaning.extra";
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = false;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).hashCode();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v9).testForEqualityHelper(((com.google.javascript.rhino.jstype.JSType)v17),((com.google.javascript.rhino.jstype.JSType)v22));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = true;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).getPossibleToBooleanOutcomes();
    ((com.google.javascript.rhino.jstype.JSType)v7).clearResolved();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = 1.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v12).equals(((java.lang.Object)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v3).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    ((com.google.javascript.rhino.jstype.JSType)v22).forgiveUnknownNames();
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumber();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v5).testForEqualityHelper(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "msg.jsdoc.meaning.extra";
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).findPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).isVoidType();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "msg.jsdoc.meaning.extra";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = "msg.jsdoc.meaning.extra";
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).findPropertyType(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = "msg.jsdoc.meaning.extra";
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v24).findPropertyType(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v20).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v14).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toDebugHashCodeString();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = "msg.jsdoc.meaning.extra";
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v10).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).dereference();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = false;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v22).differsFrom(((com.google.javascript.rhino.jstype.JSType)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = "msg.jsdoc.meaning.extra";
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v11).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "msg.jsdoc.meaning.extra";
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).findPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumber();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isRegexpType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNullType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toDebugHashCodeString();
    ((com.google.javascript.rhino.jstype.JSType)v4).setResolvedTypeInternal(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "msg.jsdoc.meaning.extra";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = "msg.jsdoc.meaning.extra";
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).findPropertyType(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = "msg.jsdoc.meaning.extra";
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v24).findPropertyType(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v20).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v14).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v14));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = false;
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32));
    Object v34 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = true;
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v34).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v36).toObjectType();
    Object v38 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v29),((com.google.javascript.rhino.jstype.JSType)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = false;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v16).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = "@modifies may only appear in extern";
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v16).findPropertyType(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = "G";
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v25).findPropertyType(((java.lang.String)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).equals(((java.lang.Object)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = false;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v23),((com.google.javascript.rhino.jstype.JSType)v28));
    Object v30 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v18).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v18).toObjectType();
    Object v33 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v34 = false;
    Object v35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v32).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v36));
    Object v38 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v32));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = false;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v16).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = "@modifies may only appear in extern";
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v16).findPropertyType(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = true;
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isBooleanValueType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "msg.jsdoc.meaning.extra";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v13 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    ((com.google.javascript.rhino.jstype.JSType)v10).forgiveUnknownNames();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "msg.jsdoc.meaning.extra";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v13).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v7).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v28));
    Object v30 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v24),((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v32 = false;
    Object v33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v33));
    Object v35 = "msg.jsdoc.meaning.extra";
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v34).findPropertyType(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v30).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v36));
    Object v38 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v30));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNamedType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = "@modifies may only appear in extern";
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v10).findPropertyType(((java.lang.String)v17));
    Object v19 = 1.0D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v18).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_FUNCTION_TYPE;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).isNominalType();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isString();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).hashCode();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "msg.jsdoc.meaning.extra";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v10).testForEquality(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v20);
  }
}
