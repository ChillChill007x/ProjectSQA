package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).isDict();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isString();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).isDict();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v4).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).getPossibleToBooleanOutcomes();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isGlobalThisType();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).isObject();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).canBeCalled();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).getDisplayName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    ((com.google.javascript.rhino.jstype.UnionType)v4).matchConstraint(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).canBeCalled();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v4).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.util.HashSet();
    Object v14 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.util.Collection)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.UnionType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isDict();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).matchesObjectContext();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isString();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v4).meet(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.util.HashSet();
    Object v14 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.util.Collection)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.UnionType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isDict();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.HashSet();
    Object v22 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v21));
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new java.util.HashSet();
    Object v27 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25),((java.util.Collection)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.UnionType)v22).meet(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = ((com.google.javascript.rhino.jstype.UnionType)v17).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).findPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = "l";
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).hasProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v10).meet(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).toStringHelper((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("()"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v4).meet(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v10).isInvariant(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = "CHECKED_UNKNOWN_TYPE";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v10).meet(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.UnionType)v17).isObject();
    Object v19 = ((com.google.javascript.rhino.jstype.UnionType)v17).collapseUnion();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).hasAnyTemplate();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v5).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isString();
    Object v7 = ((com.google.javascript.rhino.jstype.UnionType)v5).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumber();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v9).toMaybeUnionType();
    ((com.google.javascript.rhino.jstype.UnionType)v4).matchConstraint(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.HashSet();
    Object v16 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.util.Collection)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v16).toMaybeUnionType();
    Object v18 = ((com.google.javascript.rhino.jstype.UnionType)v4).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v10).meet(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.UnionType)v17).matchesObjectContext();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v9).toMaybeUnionType();
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v4).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v5).isObject();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v5).toDebugHashCodeString();
    org.junit.Assert.assertEquals((Object)("{()}"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v10).meet(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.UnionType)v17).hasAnyTemplateInternal();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.util.Collection)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.UnionType)v13).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = true;
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v13).toStringHelper((((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)("()"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = "";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v9).toMaybeUnionType();
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).restrictByNotNullOrUndefined();
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v4).testForEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v5).hasAnyTemplateInternal();
    Object v7 = ((com.google.javascript.rhino.jstype.UnionType)v5).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v10).meet(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toAnnotationString();
    Object v19 = true;
    Object v20 = ((com.google.javascript.rhino.jstype.UnionType)v17).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = "this";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.util.HashSet();
    Object v13 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.util.Collection)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.UnionType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.util.HashSet();
    Object v14 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.util.Collection)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.UnionType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isDict();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.HashSet();
    Object v22 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).toMaybeUnionType();
    Object v24 = "this";
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).findPropertyType(((java.lang.String)v24));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new java.util.HashSet();
    Object v31 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.util.Collection)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.UnionType)v31).autobox();
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v23).resolve(((com.google.javascript.rhino.ErrorReporter)v26),((com.google.javascript.rhino.jstype.StaticScope)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.UnionType)v33).getPossibleToBooleanOutcomes();
    Object v35 = com.google.javascript.rhino.jstype.EquivalenceMethod.INVARIANT;
    Object v36 = ((com.google.javascript.rhino.jstype.UnionType)v17).checkUnionEquivalenceHelper(((com.google.javascript.rhino.jstype.UnionType)v33),((com.google.javascript.rhino.jstype.EquivalenceMethod)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.HashSet();
    Object v16 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.util.Collection)v15));
    Object v17 = true;
    Object v18 = ((com.google.javascript.rhino.jstype.UnionType)v16).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v5).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v4).meet(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).getJSDocInfo();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.HashSet();
    Object v20 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.util.Collection)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v15).meet(((com.google.javascript.rhino.jstype.JSType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.UnionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v4).testForEquality(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).visit(((com.google.javascript.rhino.jstype.Visitor)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.util.HashSet();
    Object v14 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.util.Collection)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.UnionType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isDict();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.HashSet();
    Object v22 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).toMaybeUnionType();
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v23).restrictByNotNullOrUndefined();
    Object v25 = ((com.google.javascript.rhino.jstype.UnionType)v17).isSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.util.Collection)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.util.HashSet();
    Object v23 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),((java.util.Collection)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v23).toMaybeUnionType();
    Object v25 = ((com.google.javascript.rhino.jstype.UnionType)v18).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.UnionType)v13).meet(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v9).toMaybeUnionType();
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v4).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v5).restrictByNotNullOrUndefined();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.util.Collection)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.UnionType)v12).autobox();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).forceResolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v6).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isDict();
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = "this";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.util.HashSet();
    Object v19 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.util.Collection)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.UnionType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).isStruct();
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = "this";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.util.HashSet();
    Object v13 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.util.Collection)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.UnionType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.HashSet();
    Object v20 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.util.Collection)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v20).visit(((com.google.javascript.rhino.jstype.Visitor)v24));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new java.util.HashSet();
    Object v30 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.util.Collection)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.UnionType)v30).autobox();
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v31).isDict();
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v20).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v34 = ((com.google.javascript.rhino.jstype.UnionType)v15).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.UnionType)v5).toStringHelper((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("()"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v15).toMaybeUnionType();
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.HashSet();
    Object v22 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).autobox();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v17).testForEquality(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.UnionType)v5).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toMaybeParameterizedType();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = "this";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.util.HashSet();
    Object v13 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.util.Collection)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.UnionType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).dereference();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isString();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.HashSet();
    Object v20 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.util.Collection)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v20).autobox();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.util.Collection)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.UnionType)v4).meet(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = "this";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.util.HashSet();
    Object v13 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.util.Collection)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.UnionType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).getPossibleToBooleanOutcomes();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.HashSet();
    Object v16 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.util.Collection)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new java.util.HashSet();
    Object v21 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((java.util.Collection)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.UnionType)v16).meet(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v10).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v4).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isString();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.HashSet();
    Object v20 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.util.Collection)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v20).autobox();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).matchesNumberContext();
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v22).isNullable();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isString();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.HashSet();
    Object v20 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.util.Collection)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v20).autobox();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new java.util.HashSet();
    Object v28 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),((java.util.Collection)v27));
    Object v29 = ((com.google.javascript.rhino.jstype.UnionType)v28).toMaybeUnionType();
    Object v30 = ((com.google.javascript.rhino.jstype.UnionType)v29).restrictByNotNullOrUndefined();
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v22).resolve(((com.google.javascript.rhino.ErrorReporter)v23),((com.google.javascript.rhino.jstype.StaticScope)v30));
    Object v32 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v33 = true;
    Object v34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new java.util.HashSet();
    Object v36 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v34),((java.util.Collection)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.UnionType)v36).autobox();
    Object v38 = ((com.google.javascript.rhino.jstype.UnionType)v22).testForEquality(((com.google.javascript.rhino.jstype.JSType)v37));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = "this";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.util.HashSet();
    Object v19 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.util.Collection)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.UnionType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).isStruct();
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v23).toDebugHashCodeString();
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = true;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new java.util.HashSet();
    Object v29 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27),((java.util.Collection)v28));
    Object v30 = ((com.google.javascript.rhino.jstype.UnionType)v29).autobox();
    Object v31 = ((com.google.javascript.rhino.jstype.UnionType)v23).contains(((com.google.javascript.rhino.jstype.JSType)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v10).meet(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.HashSet();
    Object v22 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).toMaybeUnionType();
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v23).restrictByNotNullOrUndefined();
    Object v25 = ((com.google.javascript.rhino.jstype.UnionType)v17).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = "v";
    Object v27 = ((com.google.javascript.rhino.jstype.UnionType)v17).findPropertyType(((java.lang.String)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.HashSet();
    Object v16 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.util.Collection)v15));
    Object v17 = true;
    Object v18 = ((com.google.javascript.rhino.jstype.UnionType)v16).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v5).isSubtype(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.util.HashSet();
    Object v26 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24),((java.util.Collection)v25));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new java.util.HashSet();
    Object v31 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.util.Collection)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.UnionType)v26).meet(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v21),((com.google.javascript.rhino.jstype.StaticScope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ": !";
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).hasProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = com.google.javascript.rhino.jstype.EquivalenceMethod.INVARIANT;
    Object v13 = ((com.google.javascript.rhino.jstype.UnionType)v5).checkUnionEquivalenceHelper(((com.google.javascript.rhino.jstype.UnionType)v11),((com.google.javascript.rhino.jstype.EquivalenceMethod)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isStringValueType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).autobox();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).isInvariant(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v5).isString();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = "this";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.util.HashSet();
    Object v19 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.util.Collection)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.UnionType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v5).differsFrom(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v5).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.UnionType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNullType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isString();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new java.util.HashSet();
    Object v20 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.util.Collection)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.UnionType)v20).autobox();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).isNullable();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.util.Collection)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.UnionType)v15).toMaybeUnionType();
    Object v17 = ((com.google.javascript.rhino.jstype.UnionType)v10).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.HashSet();
    Object v22 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v22).autobox();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v17).testForEquality(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.UnionType)v5).getRestrictedUnion(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).isNullType();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.util.Collection)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.UnionType)v4).toMaybeUnionType();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new java.util.HashSet();
    Object v10 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.util.Collection)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.UnionType)v10).toMaybeUnionType();
    Object v12 = "this";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.util.HashSet();
    Object v19 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.util.Collection)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.UnionType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).isStruct();
    Object v23 = ((com.google.javascript.rhino.jstype.UnionType)v5).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v24 = ((com.google.javascript.rhino.jstype.UnionType)v23).isStruct();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }
}
