package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).equals(((java.lang.Object)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v10).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v5).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v18).differsFrom(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = true;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.ArrowType)v18).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).forceResolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.ArrowType)v18).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toAnnotationString();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v12).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).autobox();
    Object v25 = ((com.google.javascript.rhino.jstype.ArrowType)v18).isSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ":";
    Object v31 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v32 = true;
    Object v33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((com.google.javascript.rhino.jstype.ObjectType)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.google.javascript.rhino.jstype.ArrowType)v26).isSubtype(((com.google.javascript.rhino.jstype.JSType)v37));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEmptyType();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isGlobalThisType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).autobox();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v18).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v26).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).toObjectType();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ":";
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16),((com.google.javascript.rhino.jstype.ObjectType)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v12).canTestForEqualityWith(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v12).toAnnotationString();
    org.junit.Assert.assertEquals((Object)("?"), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -12;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ":";
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),((java.lang.String)v22),((com.google.javascript.rhino.jstype.ObjectType)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.JSType)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v12).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v34 = true;
    Object v35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.google.javascript.rhino.jstype.JSType)v37).isString();
    Object v39 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType)v37));
    org.junit.Assert.assertEquals((Object)(false), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hashCode();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "...[";
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).findPropertyType(((java.lang.String)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).getDisplayName();
    org.junit.Assert.assertEquals((Object)("Unknown"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v10).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v10).matchesInt32Context();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v12).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).autobox();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).restrictByNotNullOrUndefined();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).restrictByNotNullOrUndefined();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearNamedTypes();
    Object v3 = null;
    Object v4 = -12;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = -12;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toDebugHashCodeString();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).restrictByNotNullOrUndefined();
    Object v12 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNumber();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearNamedTypes();
    Object v3 = null;
    Object v4 = -12;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = -12;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).isGlobalThisType();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = true;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v29).autobox();
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).restrictByNotNullOrUndefined();
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v23).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ":";
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8),((com.google.javascript.rhino.jstype.ObjectType)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = false;
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).isSubtype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v4).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).restrictByNotNullOrUndefined();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).hashCode();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v7).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v12).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).restrictByNotNullOrUndefined();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).isEmptyType();
    Object v17 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).restrictByNotNullOrUndefined();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).autobox();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v4).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).restrictByNotNullOrUndefined();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).restrictByNotNullOrUndefined();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).isNoObjectType();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).restrictByNotNullOrUndefined();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ":";
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25),((java.lang.String)v26),((com.google.javascript.rhino.jstype.ObjectType)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v33).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v22).differsFrom(((com.google.javascript.rhino.jstype.JSType)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v32).autobox();
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).restrictByNotNullOrUndefined();
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).autobox();
    Object v36 = ((com.google.javascript.rhino.jstype.StaticScope)v35).getParentScope();
    Object v37 = ((com.google.javascript.rhino.jstype.ArrowType)v26).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v27),((com.google.javascript.rhino.jstype.StaticScope)v35));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
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
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearNamedTypes();
    Object v3 = null;
    Object v4 = -12;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = -12;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v28).autobox();
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v29).restrictByNotNullOrUndefined();
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).autobox();
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v23).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).clearNamedTypes();
    Object v9 = null;
    Object v10 = -12;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = -12;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.rhino.Node)v12).isEquivalentToTyped(((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ":";
    Object v21 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((java.lang.String)v20),((com.google.javascript.rhino.jstype.ObjectType)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v5).autoboxesTo();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ":";
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((com.google.javascript.rhino.jstype.ObjectType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v18).resolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).toDebugHashCodeString();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isConstructor();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearNamedTypes();
    Object v3 = null;
    Object v4 = -12;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = -12;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.ArrowType)v23).hasUnknownParamsOrReturn();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isNumberValueType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearNamedTypes();
    Object v3 = null;
    Object v4 = -12;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = -12;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).autobox();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).restrictByNotNullOrUndefined();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).autobox();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isString();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toString();
    org.junit.Assert.assertEquals((Object)("??"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearNamedTypes();
    Object v3 = null;
    Object v4 = -12;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = -12;
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),((com.google.javascript.rhino.Node[])v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ":";
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v23).equals(((java.lang.Object)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = "superClass_";
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).findPropertyType(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toAnnotationString();
    org.junit.Assert.assertEquals((Object)(":"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v32).autobox();
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).restrictByNotNullOrUndefined();
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).autobox();
    Object v36 = ((com.google.javascript.rhino.jstype.StaticScope)v35).getParentScope();
    Object v37 = ((com.google.javascript.rhino.jstype.ArrowType)v26).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v27),((com.google.javascript.rhino.jstype.StaticScope)v35));
    Object v38 = ((com.google.javascript.rhino.jstype.ArrowType)v37).hasUnknownParamsOrReturn();
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).autobox();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).restrictByNotNullOrUndefined();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v12).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).restrictByNotNullOrUndefined();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).autobox();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v7).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).toMaybeUnionType();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ":";
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((com.google.javascript.rhino.jstype.ObjectType)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).isBooleanValueType();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).autobox();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).restrictByNotNullOrUndefined();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v21));
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v28).autobox();
    Object v30 = ((com.google.javascript.rhino.jstype.JSType)v29).restrictByNotNullOrUndefined();
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v23),((com.google.javascript.rhino.jstype.StaticScope)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v31).isNoObjectType();
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v8).equals(((java.lang.Object)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = false;
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v32).autobox();
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).restrictByNotNullOrUndefined();
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).autobox();
    Object v36 = ((com.google.javascript.rhino.jstype.StaticScope)v35).getParentScope();
    Object v37 = ((com.google.javascript.rhino.jstype.ArrowType)v26).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v27),((com.google.javascript.rhino.jstype.StaticScope)v35));
    Object v38 = ((com.google.javascript.rhino.jstype.JSType)v37).isCheckedUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v17).clearNamedTypes();
    Object v18 = null;
    Object v19 = -12;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = -12;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = ((com.google.javascript.rhino.Node)v21).isEquivalentToTyped(((com.google.javascript.rhino.Node)v24));
    Object v26 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ":";
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = true;
    Object v34 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = false;
    Object v36 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((com.google.javascript.rhino.jstype.ObjectType)v34),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = false;
    Object v38 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.JSType)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = ((com.google.javascript.rhino.jstype.JSType)v14).differsFrom(((com.google.javascript.rhino.jstype.JSType)v38));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.StaticScope)v24).getTypeOfThis();
    Object v26 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v32).autobox();
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).restrictByNotNullOrUndefined();
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).autobox();
    Object v36 = ((com.google.javascript.rhino.jstype.StaticScope)v35).getParentScope();
    Object v37 = ((com.google.javascript.rhino.jstype.ArrowType)v26).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v27),((com.google.javascript.rhino.jstype.StaticScope)v35));
    Object v38 = ((com.google.javascript.rhino.jstype.JSType)v37).toObjectType();
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ":";
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.ObjectType)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v24).autobox();
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).restrictByNotNullOrUndefined();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v26).autobox();
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v27).toObjectType();
    Object v29 = ((com.google.javascript.rhino.jstype.ArrowType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).autobox();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).restrictByNotNullOrUndefined();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).autobox();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toObjectType();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = "superClass_";
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).findPropertyType(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).autobox();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).restrictByNotNullOrUndefined();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).autobox();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).toObjectType();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toMaybeEnumType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = "superClass_";
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).findPropertyType(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).autobox();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v22).restrictByNotNullOrUndefined();
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v23).autobox();
    Object v25 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).isNumber();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNullable();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = -12;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ":";
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.lang.String)v15),((com.google.javascript.rhino.jstype.ObjectType)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.JSType)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).autobox();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).autobox();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).restrictByNotNullOrUndefined();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).autobox();
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v16).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).restrictByNotNullOrUndefined();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).restrictByNotNullOrUndefined();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -12;
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = new com.google.javascript.rhino.Node((((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.Node[])v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).restrictByNotNullOrUndefined();
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).autobox();
    Object v14 = false;
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.ArrowType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }
}
