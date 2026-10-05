package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = "";
    Object v12 = "";
    Object v13 = 4;
    Object v14 = "m";
    Object v15 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v10).warning(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = "K";
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).findPropertyType(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).differsFrom(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNoObjectType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isAllType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 11;
    Object v8 = "?";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 11;
    Object v8 = "?";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isNumber();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 11;
    Object v8 = "?";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = "K";
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v20).findPropertyType(((java.lang.String)v21));
    Object v23 = false;
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v22).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v16).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v3).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumber();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v12).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v12).toObjectType();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).hashCode();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).isString();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).dereference();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = false;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    ((com.google.javascript.rhino.jstype.JSType)v11).forgiveUnknownNames();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = "";
    Object v18 = "";
    Object v19 = 4;
    Object v20 = "m";
    Object v21 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v16).warning(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v15).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v11).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v9).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "K";
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).findPropertyType(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v16).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = "K";
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).findPropertyType(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).hashCode();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v9).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isString();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).differsFrom(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).dereference();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).toObjectType();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = "call";
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = "";
    Object v12 = "";
    Object v13 = 11;
    Object v14 = "?";
    Object v15 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v10).error(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = "K";
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v26).findPropertyType(((java.lang.String)v27));
    Object v29 = false;
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v28).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v22).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.jstype.JSType)v22));
    Object v33 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 13;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v15),((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).testForEquality(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v15),((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).testForEquality(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v8).isSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    ((com.google.javascript.rhino.jstype.JSType)v6).clearResolved();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = "";
    Object v15 = "";
    Object v16 = 4;
    Object v17 = "m";
    Object v18 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v13).warning(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v12).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isRegexpType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    ((com.google.javascript.rhino.jstype.JSType)v9).forgiveUnknownNames();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = "";
    Object v10 = "";
    Object v11 = 11;
    Object v12 = "?";
    Object v13 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v16 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isNullable();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isNumber();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).dereference();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toObjectType();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).dereference();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v17).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v17).toObjectType();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v15),((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).testForEquality(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v20 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v17),((com.google.javascript.rhino.ErrorReporter)v18),((com.google.javascript.rhino.jstype.StaticScope)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v9).resolve(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v9).forceResolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v22 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v19),((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v15).testForEquality(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v15).dereference();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNullable();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).dereference();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toObjectType();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v18).resolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).dereference();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v12).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).forceResolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).dereference();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v17).resolve(((com.google.javascript.rhino.ErrorReporter)v18),((com.google.javascript.rhino.jstype.StaticScope)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).dereference();
    Object v22 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).matchesObjectContext();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v24 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v21),((com.google.javascript.rhino.ErrorReporter)v22),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v17).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = "";
    Object v32 = "";
    Object v33 = 11;
    Object v34 = "?";
    Object v35 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v30).error(((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()));
    Object v36 = null;
    Object v37 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v38 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v29),((com.google.javascript.rhino.ErrorReporter)v30),((com.google.javascript.rhino.jstype.StaticScope)v37));
    Object v39 = ((com.google.javascript.rhino.jstype.JSType)v17).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v15).resolve(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v15).forceResolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).dereference();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v26).toObjectType();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v27).resolve(((com.google.javascript.rhino.ErrorReporter)v28),((com.google.javascript.rhino.jstype.StaticScope)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).dereference();
    Object v32 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21),((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "K";
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).toObjectType();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = "JSLC_TMP_PLACE_HOLDER";
    Object v11 = ((com.google.javascript.rhino.jstype.StaticScope)v9).getSlot(((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = false;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).dereference();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toObjectType();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v5),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v12).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v12).toObjectType();
    Object v19 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = false;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 11;
    Object v8 = "?";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).dereference();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v19 = "JSLC_TMP_PLACE_HOLDER";
    Object v20 = ((com.google.javascript.rhino.jstype.StaticScope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v16),((com.google.javascript.rhino.ErrorReporter)v17),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v22 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = "";
    Object v12 = "";
    Object v13 = 4;
    Object v14 = "m";
    Object v15 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v10).warning(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v26 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v23),((com.google.javascript.rhino.ErrorReporter)v24),((com.google.javascript.rhino.jstype.StaticScope)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v5).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v15).resolve(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v15).forceResolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).dereference();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v26).toObjectType();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v27).resolve(((com.google.javascript.rhino.ErrorReporter)v28),((com.google.javascript.rhino.jstype.StaticScope)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).dereference();
    Object v32 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21),((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).dereference();
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 11;
    Object v8 = "?";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v12).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "K";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = false;
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v14).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toObjectType();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = "JSLC_TMP_PLACE_HOLDER";
    Object v22 = ((com.google.javascript.rhino.jstype.StaticScope)v20).getSlot(((java.lang.String)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v24 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = "";
    Object v6 = "";
    Object v7 = 11;
    Object v8 = "?";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).error(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).dereference();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).dereference();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).isNullable();
    Object v18 = com.google.javascript.rhino.jstype.JSType.isSubtype(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = "";
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v22 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v20).resolve(((com.google.javascript.rhino.ErrorReporter)v21),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).toObjectType();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v27 = "JSLC_TMP_PLACE_HOLDER";
    Object v28 = ((com.google.javascript.rhino.jstype.StaticScope)v26).getSlot(((java.lang.String)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v24),((com.google.javascript.rhino.ErrorReporter)v25),((com.google.javascript.rhino.jstype.StaticScope)v26));
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = "JSLC_TMP_PLACE_HOLDER";
    Object v11 = ((com.google.javascript.rhino.jstype.StaticScope)v9).getSlot(((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).matchesObjectContext();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).resolve(((com.google.javascript.rhino.ErrorReporter)v6),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v15).resolve(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v15).forceResolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).dereference();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v26).toObjectType();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v27).resolve(((com.google.javascript.rhino.ErrorReporter)v28),((com.google.javascript.rhino.jstype.StaticScope)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).dereference();
    Object v32 = com.google.javascript.rhino.jstype.JSType.getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v21),((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).dereference();
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v14).resolve(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v10).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = com.google.javascript.rhino.jstype.JSType.safeResolve(((com.google.javascript.rhino.jstype.JSType)v10),((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    org.junit.Assert.assertNotNull(v21);
  }
}
