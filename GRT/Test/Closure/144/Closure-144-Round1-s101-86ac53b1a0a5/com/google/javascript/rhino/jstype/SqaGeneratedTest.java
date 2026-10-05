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
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNoObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
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
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = 13;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 13;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = "R";
    Object v24 = true;
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ArrowType)v18),((com.google.javascript.rhino.jstype.ObjectType)v22),((java.lang.String)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Boolean)v25).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getInstanceType();
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getTopMostDefiningType(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getPrototype();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = " ";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isString();
    Object v10 = false;
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v3).defineInferredProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 13;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = false;
    Object v24 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.JSType)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.ObjectType)v12).testForEquality(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionType)v12).isSubtype(((com.google.javascript.rhino.jstype.JSType)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).isUnknownType();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasUnknownSupertype();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v12).getJSDocInfo();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 13;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSType)v11).clearResolved();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).toString();
    org.junit.Assert.assertEquals((Object)("None"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNumber();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).toString();
    org.junit.Assert.assertEquals((Object)("None"), v7);
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
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v15 = ((com.google.javascript.rhino.jstype.StaticScope)v14).getTypeOfThis();
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v12).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).toDebugHashCodeString();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).isNullable();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getSuperClassConstructor();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getPrototype();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v3).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = "JSC_INTERNAL_ERROR_DATAFLOS";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).hasProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getPrototype();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getSuperClassConstructor();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getPrototype();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v16).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v17),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v12).testForEquality(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionType)v6).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v12));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = "i";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).isPropertyTypeInferred(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNullable();
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNullable();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getJSDocInfo();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getJSDocInfo();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getPrototype();
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).findPropertyType(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getSuperClassConstructor();
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v12).testForEquality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v12).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).hashCode();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = "pro5otype";
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v17).findPropertyType(((java.lang.String)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPrototype();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getSuperClassConstructor();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isSubtype(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ", ";
    Object v4 = 13;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 13;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = "pro5otype";
    Object v24 = ((com.google.javascript.rhino.jstype.ObjectType)v22).findPropertyType(((java.lang.String)v23));
    Object v25 = "";
    Object v26 = false;
    Object v27 = false;
    Object v28 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ArrowType)v18),((com.google.javascript.rhino.jstype.ObjectType)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "pro5otype";
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v14).findPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v16).getTypeOfThis();
    ((com.google.javascript.rhino.jstype.FunctionType)v10).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getParameters();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).restrictByNotNullOrUndefined();
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = "fun@tion";
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 13;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.JSType)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v27).toDebugHashCodeString();
    Object v29 = false;
    Object v30 = false;
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionType)v5).defineProperty(((java.lang.String)v15),((com.google.javascript.rhino.jstype.JSType)v27),(((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v10).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 13;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getSuperClassConstructor();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v6).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "pro5otype";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPrototype();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 13;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v18).resolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = java.util.List.of();
    ((com.google.javascript.rhino.jstype.FunctionType)v10).setImplementedInterfaces(((java.util.List)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getSource();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 13;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()));
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
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v15).resolve(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v11).differsFrom(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = "pro5otype";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).findPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPrototype();
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v6).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v13));
    Object v15 = java.util.List.of();
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setImplementedInterfaces(((java.util.List)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = "pro5otype";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).findPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPrototype();
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v6).setPrototype(((com.google.javascript.rhino.jstype.FunctionPrototypeType)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getTopMostDefiningType(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 13;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "~";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 13;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.JSType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = true;
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionType)v8).defineProperty(((java.lang.String)v9),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v10).getJSDocInfo();
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "pro5otype";
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionType)v11).getTypeOfThis();
    ((com.google.javascript.rhino.jstype.FunctionType)v5).setInstanceType(((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).restrictByNotNullOrUndefined();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v3).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 13;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 13;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v11).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ObjectType)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v9));
    Object v10 = null;
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v8).toString();
    org.junit.Assert.assertEquals((Object)("None"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v10).getPropertyNames();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isString();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getTypeOfThis();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v7).hasProperty(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).toDebugHashCodeString();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getImplementedInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v3).forceResolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).setLastGeneration((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = 13;
    Object v7 = new com.google.javascript.rhino.Node[]{};
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),((com.google.javascript.rhino.Node[])v7));
    Object v9 = com.google.javascript.rhino.jstype.FunctionType.forInterface(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v5),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getPrototype();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getParameterType();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = java.util.List.of();
    ((com.google.javascript.rhino.jstype.FunctionType)v8).setImplementedInterfaces(((java.util.List)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isString();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getTypeOfThis();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPrototype();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = "pro5otype";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).findPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getTypeOfThis();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v6).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v10).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).restrictByNotNullOrUndefined();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getSuperClassConstructor();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPrototype();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v6).getImplementedInterfaces();
    org.junit.Assert.assertNotNull(v7);
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
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionType)v14).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v10).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).restrictByNotNullOrUndefined();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v14).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v15),((com.google.javascript.rhino.jstype.StaticScope)v16));
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
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
    Object v7 = 4;
    Object v8 = "m";
    Object v9 = 1;
    ((com.google.javascript.rhino.ErrorReporter)v4).warning(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isString();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = "pro5otype";
    Object v17 = ((com.google.javascript.rhino.jstype.ObjectType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v17).getTypeOfThis();
    Object v19 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v10),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
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
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v14).hasProperty(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "pro5otype";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).findPropertyType(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getTypeOfThis();
    Object v7 = java.util.List.of();
    ((com.google.javascript.rhino.jstype.FunctionType)v6).setImplementedInterfaces(((java.util.List)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).dereference();
    Object v12 = "true";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).findPropertyType(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).restrictByNotNullOrUndefined();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getTemplateTypeName();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.testing.EmptyScope();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v8).hasOwnProperty(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }
}
