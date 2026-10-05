package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = ")";
    Object v10 = "k";
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).toString();
    org.junit.Assert.assertEquals((Object)("None"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.rhino.jstype.FunctionType)v2).setSource(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = "%";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v2).hasProperty(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNullable();
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = ")";
    Object v11 = "k";
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).isSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = ")";
    Object v11 = "k";
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).isPropertyTypeInferred(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = ")";
    Object v6 = "k";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v9).isSubtype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v9).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v2).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getPropertyNames();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).dereference();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = " does not exist in grfaph";
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 15;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = ")";
    Object v14 = "k";
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v22 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v20).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v21),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v17),((com.google.javascript.rhino.jstype.ObjectType)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "Scope roots used with the symbol table do not match.\nExpected : {0}\nActual : {1}";
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = ")";
    Object v15 = "k";
    Object v16 = 0;
    Object v17 = 0;
    Object v18 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v21 = false;
    Object v22 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineInferredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v29 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionType)v27).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v28),((com.google.javascript.rhino.jstype.StaticScope)v29));
    Object v31 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v31));
    Object v33 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32));
    Object v34 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24),((com.google.javascript.rhino.jstype.FunctionType)v30),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.ObjectType)v34).getPropertyNames();
    Object v36 = ((com.google.javascript.rhino.jstype.FunctionType)v2).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v34));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = ")";
    Object v5 = "k";
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3),((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v8).isSubtype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v14 = java.util.List.of();
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v13),((java.util.List)v14));
    Object v16 = "$";
    Object v17 = 15;
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 15;
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v32 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v33 = ((com.google.javascript.rhino.jstype.FunctionType)v30).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v31),((com.google.javascript.rhino.jstype.StaticScope)v32));
    Object v34 = "{";
    Object v35 = true;
    Object v36 = true;
    Object v37 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.JSType)v27),((com.google.javascript.rhino.jstype.ObjectType)v33),((java.lang.String)v34),(((java.lang.Boolean)v35).booleanValue()),(((java.lang.Boolean)v36).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v18 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v16).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v17),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.jstype.FunctionType)v19),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.ObjectType)v11).testForEquality(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v2).isSubtype(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).isSubtype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v12 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v18 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v16).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v17),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.jstype.FunctionType)v19),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v31 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionType)v29).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v30),((com.google.javascript.rhino.jstype.StaticScope)v31));
    Object v33 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v33));
    Object v35 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v34));
    Object v36 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),((com.google.javascript.rhino.jstype.FunctionType)v32),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.ObjectType)v11).testForEquality(((com.google.javascript.rhino.jstype.JSType)v36));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getImplementedInterfaces();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).hasUnknownSupertype();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    ((com.google.javascript.rhino.jstype.FunctionType)v2).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumber();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v18 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v16).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v17),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.jstype.FunctionType)v19),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v31 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionType)v29).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v30),((com.google.javascript.rhino.jstype.StaticScope)v31));
    Object v33 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v33));
    Object v35 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v34));
    Object v36 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),((com.google.javascript.rhino.jstype.FunctionType)v32),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.ObjectType)v11).testForEquality(((com.google.javascript.rhino.jstype.JSType)v36));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).hasUnknownSupertype();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isBooleanObjectType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = java.util.List.of();
    ((com.google.javascript.rhino.jstype.FunctionType)v2).setImplementedInterfaces(((java.util.List)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getMinArguments();
    Object v11 = "+";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTopMostDefiningType(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autoboxesTo();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4),((com.google.javascript.rhino.jstype.FunctionType)v10),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createEnumType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = "B";
    Object v17 = 15;
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 15;
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 1;
    Object v26 = ((com.google.javascript.rhino.Node)v24).getAncestor((((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = "EMPTY";
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionType)v29).getPropertyType(((java.lang.String)v30));
    Object v32 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v32));
    Object v34 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).dereference();
    Object v36 = "fuoction (";
    Object v37 = false;
    Object v38 = true;
    Object v39 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.JSType)v31),((com.google.javascript.rhino.jstype.ObjectType)v35),((java.lang.String)v36),(((java.lang.Boolean)v37).booleanValue()),(((java.lang.Boolean)v38).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = true;
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).getPossibleToBooleanOutcomes();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v2).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).dereference();
    Object v14 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = "EMPTY";
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getPropertyType(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v13).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v9).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getParameters();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).hasUnknownSupertype();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = ")";
    Object v7 = "k";
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.jstype.FunctionType)v12),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = false;
    Object v18 = false;
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v3).defineProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getTypeOfThis();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "prototype";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "prototype";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ")";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = "x";
    Object v15 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v21 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionType)v19).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.jstype.FunctionType)v22),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = true;
    Object v28 = ((com.google.javascript.rhino.jstype.ObjectType)v11).defineInferredProperty(((java.lang.String)v14),((com.google.javascript.rhino.jstype.JSType)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNumber();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getJSDocInfo();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).dereference();
    Object v7 = "prototype";
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).findPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v2).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "prototype";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v12 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v13 = "\n";
    Object v14 = ((com.google.javascript.rhino.jstype.StaticScope)v12).getSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v6).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).dereference();
    Object v11 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v10).testForEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getParameters();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getParametersNode();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).dereference();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isAllType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).dereference();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isNullable();
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "EMPTY";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getPropertyType(((java.lang.String)v8));
    Object v10 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v16 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v14).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((com.google.javascript.rhino.jstype.FunctionType)v17),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v9).testForEquality(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "prototype";
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    ((com.google.javascript.rhino.jstype.JSType)v2).clearResolved();
    Object v3 = null;
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getJSDocInfo();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNamedType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).toString();
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v5).hasProperty(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "prototype";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isString();
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).differsFrom(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = ")";
    Object v7 = "k";
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).forwardDeclareType(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "";
    Object v5 = 15;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 15;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = "EMPTY";
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionType)v20).getPropertyType(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).toObjectType();
    Object v24 = "";
    Object v25 = true;
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v4),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v17),((com.google.javascript.rhino.jstype.ObjectType)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "EMPTY";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v9).equals(((java.lang.Object)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v9).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = ")";
    Object v11 = "k";
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "u";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isPropertyTypeInferred(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getMinArguments();
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = "prototype";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).findPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v15 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v14).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = "\n";
    Object v22 = ((com.google.javascript.rhino.jstype.StaticScope)v20).getSlot(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v14).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getSuperClassConstructor();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getTopMostDefiningType(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "prototype";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = " (CLASS)\n";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).hasOwnProperty(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = "prototype";
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v7 = "rototype";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).isPropertyTypeInferred(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).dereference();
    Object v16 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v17 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v15).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ")";
    Object v3 = "k";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).dereference();
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getJSDocInfo();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isInstanceType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getSuperClassConstructor();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).hasOwnProperty(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).toString();
    org.junit.Assert.assertEquals((Object)("None"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.jstype.FunctionType)v12),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v4).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isString();
    Object v6 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).dereference();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).hasUnknownSupertype();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v4 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v4));
    Object v6 = 15;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.jstype.FunctionType)v5).setSource(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionPrototypeType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.StaticScope)v6).getSlot(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = ": ";
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 15;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = "EMPTY";
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getPropertyType(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v13).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionType)v20).getTypeOfThis();
    Object v22 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v24).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v28 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v29 = "";
    Object v30 = ((com.google.javascript.rhino.jstype.StaticScope)v28).getSlot(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionType)v26).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v27),((com.google.javascript.rhino.jstype.StaticScope)v28));
    Object v32 = "prototype";
    Object v33 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v21),((com.google.javascript.rhino.jstype.ObjectType)v31),((java.lang.String)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).dereference();
    Object v4 = " ";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = ")";
    Object v11 = "k";
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getSuperClassConstructor();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "M";
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "EMPTY";
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v6 = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v10));
    ((com.google.javascript.rhino.jstype.FunctionType)v5).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v12 = null;
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getReturnType();
    org.junit.Assert.assertNotNull(v13);
  }
}
