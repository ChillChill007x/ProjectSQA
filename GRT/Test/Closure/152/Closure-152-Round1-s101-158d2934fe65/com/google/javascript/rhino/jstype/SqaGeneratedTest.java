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
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "JSComp";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTopMostDefiningType(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getJSDocInfo();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNullable();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toDebugHashCodeString();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).toString();
    org.junit.Assert.assertEquals((Object)("None"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "(Y";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "=";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getPropertyType(((java.lang.String)v9));
    Object v11 = ", ";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = true;
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v3).defineInferredProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTopMostDefiningType(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "=";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v7).testForEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "=";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = "=";
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionType)v19).getPropertyType(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).toObjectType();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = "G=> ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).hasProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = "*";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTopMostDefiningType(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = "=";
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getPrototype();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTypeOfThis();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = "U";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).hasOwnProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "=";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v8).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isPropertyTypeInferred(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "=";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = ", ";
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getSuperClassConstructor();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v7).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTypeOfThis();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = "=";
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getPrototype();
    Object v18 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v9),((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).forceResolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v8).findPropertyType(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "=";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = "=";
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionType)v19).getPropertyType(((java.lang.String)v20));
    Object v22 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v15).isSubtype(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionType)v8).isSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "=";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPrototype();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).dereference();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "=";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = ", ";
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getSuperClassConstructor();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v17).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v8).isSubtype(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getJSDocInfo();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).forceResolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = "=";
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toObjectType();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getPrototype();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).dereference();
    Object v21 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v8);
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
    Object v8 = "=";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getPropertyType(((java.lang.String)v8));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v9));
    ((com.google.javascript.rhino.jstype.FunctionType)v3).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "=";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ObjectType)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    Object v9 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v8));
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setImplementedInterfaces(((java.util.List)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasProperty(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    Object v9 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = ((java.util.List)v9).spliterator();
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setImplementedInterfaces(((java.util.List)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).hasUnknownSupertype();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isDateType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).forceResolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v11).getParameterType();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = "=";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v6).testForEquality(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).forceResolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).hasProperty(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "7";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getTopMostDefiningType(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "=";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPrototype();
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v5).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "=";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getPrototype();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toDebugHashCodeString();
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v5).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTypeOfThis();
    Object v10 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    Object v12 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getSuperClassConstructor();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).dereference();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = "c";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = "=";
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getPropertyType(((java.lang.String)v14));
    Object v16 = ", ";
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getPropertyType(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v8).defineInferredProperty(((java.lang.String)v9),((com.google.javascript.rhino.jstype.JSType)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toDebugHashCodeString();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = "*";
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).hasProperty(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toDebugHashCodeString();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).toDebugHashCodeString();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v19).toObjectType();
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionType)v21).getTypeOfThis();
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v25),((com.google.javascript.rhino.jstype.StaticScope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toDebugHashCodeString();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getTypeOfThis();
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toDebugHashCodeString();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v11).isReturnTypeInferred();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).toDebugHashCodeString();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).toObjectType();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getTypeOfThis();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isEmptyType();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v8).equals(((java.lang.Object)v16));
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).toDebugHashCodeString();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v21).toObjectType();
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionType)v23).getTypeOfThis();
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionType)v8).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v6).forceResolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = "=";
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v15).getPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toObjectType();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).getPrototype();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).dereference();
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionType)v11).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isCheckedUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = 13;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    ((com.google.javascript.rhino.jstype.FunctionType)v7).setSource(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "=";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = ", ";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getSuperClassConstructor();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getTypeOfThis();
    Object v16 = false;
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v4).defineProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).toDebugHashCodeString();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).toObjectType();
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getTypeOfThis();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getPrototype();
    Object v16 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTypeOfThis();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isVoidType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).dereference();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "=";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v17).getTypeOfThis();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getSubTypes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    Object v8 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "=";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toObjectType();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v8).isSubtype(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v8).isBooleanValueType();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toDebugHashCodeString();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "=";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).differsFrom(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }
}
