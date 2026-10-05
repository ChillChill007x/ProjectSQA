package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "\\n";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isNullable();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v10),((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTemplateTypeName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "\\n";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionType)v3).isSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSuperClassConstructor();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "N";
    Object v10 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getOwnSlot(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v3).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getJSDocInfo();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getPrototype();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).resolve(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getSlot(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v3).setPrototype(((com.google.javascript.rhino.jstype.PrototypeObjectType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getOwnPropertyNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = "N";
    Object v15 = ((com.google.javascript.rhino.jstype.StaticScope)v13).getOwnSlot(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionType)v8).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v4).differsFrom(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).toString();
    org.junit.Assert.assertEquals((Object)("NoResolvedType"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v3).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    ((com.google.javascript.rhino.jstype.FunctionType)v3).clearCachedValues();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "\\n";
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7),((com.google.javascript.rhino.jstype.ObjectType)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.ObjectType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "N";
    Object v16 = ((com.google.javascript.rhino.jstype.StaticScope)v14).getOwnSlot(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).isSubtype(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "N";
    Object v16 = ((com.google.javascript.rhino.jstype.StaticScope)v14).getOwnSlot(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v18).getDisplayName();
    org.junit.Assert.assertEquals((Object)("Unknown"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v11));
    ((com.google.javascript.rhino.jstype.FunctionType)v3).setExtendedInterfaces(((java.util.List)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    ((com.google.javascript.rhino.jstype.FunctionType)v3).clearCachedValues();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPrototype();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v5).setPrototype(((com.google.javascript.rhino.jstype.PrototypeObjectType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "devirtualizePrototypeMethods";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v10).testForEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = 0;
    Object v17 = -3;
    Object v18 = -24;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v3).defineInferredProperty(((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSType)v10),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNullType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasImplementedInterfaces();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v17).getPrototype();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v13).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getSuperClassConstructor();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).toString();
    org.junit.Assert.assertEquals((Object)("None"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).hasImplementedInterfaces();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getOwnPropertyNames();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = "TRUE";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getTypeOfThis();
    Object v11 = false;
    Object v12 = 0;
    Object v13 = -3;
    Object v14 = -24;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -31;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v4).defineProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v10),(((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "continue";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getOwnSlot(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).toString();
    org.junit.Assert.assertEquals((Object)("function (new:Object, *): ?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = "<";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "~";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getOwnSlot(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "Z";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).hasProperty(((java.lang.String)v12));
    ((com.google.javascript.rhino.jstype.FunctionType)v5).setPrototypeBasedOn(((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getAllImplementedInterfaces();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = true;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v15));
    ((com.google.javascript.rhino.jstype.FunctionType)v7).setImplementedInterfaces(((java.util.List)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    ((com.google.javascript.rhino.jstype.FunctionType)v4).clearCachedValues();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "N";
    Object v16 = ((com.google.javascript.rhino.jstype.StaticScope)v14).getOwnSlot(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionType)v9).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v10),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v18).getOwnSlot(((java.lang.String)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = "_";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = 0;
    Object v15 = -3;
    Object v16 = -24;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v8).defineInferredProperty(((java.lang.String)v9),((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getImplementedInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = "tre";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getTopMostDefiningType(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "\\n";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "{";
    Object v12 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getDisplayName();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hashCode();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getAllExtendedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = ".";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).findPropertyType(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = ".";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).findPropertyType(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getOwnPropertyNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionType)v10).getPrototype();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).restrictByNotNullOrUndefined();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getMinArguments();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getNormalizedReferenceName();
    org.junit.Assert.assertEquals((Object)("??"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getMaxArguments();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v3).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).restrictByNotNullOrUndefined();
    Object v16 = ".";
    Object v17 = ((com.google.javascript.rhino.jstype.ObjectType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v8).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    Object v5 = "fie";
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getTopMostDefiningType(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionType)v8).getMaxArguments();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).restrictByNotNullOrUndefined();
    Object v16 = ".";
    Object v17 = ((com.google.javascript.rhino.jstype.ObjectType)v15).findPropertyType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionType)v8).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionType)v18).hasInstanceType();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = "";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getTypeOfThis();
    Object v15 = false;
    Object v16 = 0;
    Object v17 = -3;
    Object v18 = -24;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionType)v8).defineProperty(((java.lang.String)v9),((com.google.javascript.rhino.jstype.JSType)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "-";
    Object v4 = 0;
    Object v5 = -3;
    Object v6 = -24;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isVarArgs();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 0;
    Object v13 = -3;
    Object v14 = -24;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = true;
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v19).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = "p";
    Object v23 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v21),((java.lang.String)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).dereference();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v24).toObjectType();
    Object v26 = true;
    Object v27 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.JSType)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = true;
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v31).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = "V";
    Object v35 = true;
    Object v36 = false;
    Object v37 = new com.google.javascript.rhino.jstype.FunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ArrowType)v27),((com.google.javascript.rhino.jstype.ObjectType)v33),((java.lang.String)v34),(((java.lang.Boolean)v35).booleanValue()),(((java.lang.Boolean)v36).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getReturnType();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v12));
    Object v14 = ((java.util.List)v13).size();
    ((com.google.javascript.rhino.jstype.FunctionType)v4).setExtendedInterfaces(((java.util.List)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0;
    Object v4 = -3;
    Object v5 = -24;
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "p";
    Object v14 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v12),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).dereference();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = true;
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v22).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v18).differsFrom(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = "<";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).resolve(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v7).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).isConstructor();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = "<";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).isUnknownType();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getSuperClassConstructor();
    Object v6 = "<";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionType)v4).getImplementedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getTypeOfThis();
    Object v5 = ";";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).findPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "l";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getOwnSlot(((java.lang.String)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v13));
    ((com.google.javascript.rhino.jstype.FunctionType)v3).setImplementedInterfaces(((java.util.List)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionType)v5).getPrototype();
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getOwnSlot(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getTypeOfThis();
    Object v9 = ";";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v8).findPropertyType(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v12));
    ((com.google.javascript.rhino.jstype.FunctionType)v4).setExtendedInterfaces(((java.util.List)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionType)v3).getReturnType();
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionType)v7).getTypeOfThis();
    Object v9 = ";";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v8).findPropertyType(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).dereference();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0;
    Object v17 = -3;
    Object v18 = -24;
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "p";
    Object v27 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v25),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v27).dereference();
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v28).toObjectType();
    Object v30 = true;
    Object v31 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.JSType)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v12).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.NoResolvedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "p";
    Object v7 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(((com.google.javascript.rhino.jstype.ObjectType)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).dereference();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).toObjectType();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionType)v9).getSuperClassConstructor();
    org.junit.Assert.assertNotNull(v10);
  }
}
