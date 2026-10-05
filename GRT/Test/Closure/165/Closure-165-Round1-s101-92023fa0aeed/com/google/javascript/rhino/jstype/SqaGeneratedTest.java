package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "F";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getTypesWithProperty(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "F";
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).getTypesWithProperty(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((java.util.Collection)v10));
    Object v12 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType[])v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = "0";
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFromTypeNodes(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.StaticScope)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = "ie_event.js";
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.IR.empty();
    Object v9 = "0";
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v7).createFromTypeNodes(((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),((com.google.javascript.rhino.jstype.StaticScope)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFromTypeNodes(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.StaticScope)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "F";
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getTypesWithProperty(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createParametersWithVarArgs(((java.util.List)v7));
    Object v9 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createConstructorType(((com.google.javascript.rhino.jstype.JSType)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v10).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "F";
    Object v22 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v20).getTypesWithProperty(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.ObjectType)v7),((com.google.javascript.rhino.jstype.JSType)v17),((java.util.List)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "y";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).canPropertyBeDefined(((com.google.javascript.rhino.jstype.JSType)v6),((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "unexpect prop id ";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getGreatestSubtypeWithProperty(((com.google.javascript.rhino.jstype.JSType)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).incrementGeneration();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).shouldTolerateUndefinedValues();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "F";
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v9).getTypesWithProperty(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v6),((java.util.List)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v15).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createDefaultObjectUnion(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).resolveTypesInScope(((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "msg.jsdoc.extraveSsion";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = com.google.javascript.rhino.IR.empty();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "F";
    Object v16 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v14).getTypesWithProperty(((java.lang.String)v15));
    Object v17 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.util.Collection)v16));
    Object v18 = new com.google.javascript.rhino.jstype.EnumType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.JSType)v17));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).unregisterPropertyOnType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Y";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).registerPropertyOnType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.StaticScope)v6).getOwnSlot(((java.lang.String)v7));
    Object v9 = "Paths must both be relative or both absolute.\n  basePaZth: ";
    Object v10 = "";
    Object v11 = 0;
    Object v12 = -12;
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((com.google.javascript.rhino.jstype.StaticScope)v6),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).resetImplicitPrototype(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.ObjectType)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "UR";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).hasNamespace(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v7).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createConstructorType(((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v11));
    Object v13 = "I";
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).canPropertyBeDefined(((com.google.javascript.rhino.jstype.JSType)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createDefaultObjectUnion(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.empty();
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "F";
    Object v25 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v23).getTypesWithProperty(((java.lang.String)v24));
    Object v26 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.util.Collection)v25));
    Object v27 = new com.google.javascript.rhino.jstype.EnumType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createParameterizedType(((com.google.javascript.rhino.jstype.ObjectType)v12),((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = "U";
    Object v30 = com.google.javascript.rhino.IR.empty();
    Object v31 = ((com.google.javascript.rhino.Node)v30).siblings();
    Object v32 = com.google.javascript.rhino.IR.empty();
    Object v33 = "{";
    ((com.google.javascript.rhino.Node)v32).addSuppression(((java.lang.String)v33));
    Object v34 = null;
    Object v35 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v36 = true;
    Object v37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v37));
    Object v39 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createConstructorType(((java.lang.String)v29),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.jstype.JSType)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "@";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getEachReferenceTypeWithProperty(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ".";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getEachReferenceTypeWithProperty(((java.lang.String)v3));
    Object v5 = "JSCompiler_renameProperty";
    Object v6 = com.google.javascript.rhino.IR.empty();
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.IR.empty();
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createInterfaceType(((java.lang.String)v5),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "s";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "F";
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).getTypesWithProperty(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createParametersWithVarArgs(((java.util.List)v10));
    Object v12 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v12));
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSType[]{null,null,null};
    Object v16 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createConstructorType(((com.google.javascript.rhino.jstype.JSType)v13),(((java.lang.Boolean)v14).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v9).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "UR";
    Object v16 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v14).hasNamespace(((java.lang.String)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v19).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v14).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v11).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).resetImplicitPrototype(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.ObjectType)v11));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = false;
    Object v11 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v9),(((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v11));
    Object v13 = new com.google.javascript.rhino.jstype.JSType[]{null,null,null};
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createConstructorTypeWithVarArgs(((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.jstype.JSType[])v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = false;
    Object v19 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v20 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v13).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v17),(((java.lang.Boolean)v18).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "F";
    Object v25 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v23).getTypesWithProperty(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createFunctionType(((com.google.javascript.rhino.jstype.ObjectType)v10),((com.google.javascript.rhino.jstype.JSType)v20),((java.util.List)v25));
    Object v27 = "";
    Object v28 = "his";
    Object v29 = -1;
    Object v30 = 1;
    Object v31 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((com.google.javascript.rhino.jstype.StaticScope)v26),((java.lang.String)v27),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "*";
    Object v8 = ",";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((com.google.javascript.rhino.jstype.StaticScope)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v11).getReferenceName();
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionTypeWithNewThisType(((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).hasNamespace(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "*";
    Object v11 = ",";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getType(((com.google.javascript.rhino.jstype.StaticScope)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).declareType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v9).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).findCommonSuperObject(((com.google.javascript.rhino.jstype.ObjectType)v6),((com.google.javascript.rhino.jstype.ObjectType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "[";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).declareType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).setLastGeneration((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).resolveTypesInScope(((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE;
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getNativeFunctionType(((com.google.javascript.rhino.jstype.JSTypeNative)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "q";
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.empty();
    Object v8 = "0";
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createFromTypeNodes(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createObjectType(((java.lang.String)v2),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "&";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).unregisterPropertyOnType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).resolveTypesInScope(((com.google.javascript.rhino.jstype.StaticScope)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = false;
    Object v10 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v8),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "prototype";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createDefaultObjectUnion(((com.google.javascript.rhino.jstype.JSType)v9));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).unregisterPropertyOnType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v11),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v13));
    Object v15 = com.google.javascript.rhino.IR.empty();
    Object v16 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).incrementGeneration();
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = new com.google.javascript.rhino.jstype.JSType[]{null};
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.JSType[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSType[]{null,null,null};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createParameters(((com.google.javascript.rhino.jstype.JSType[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "b";
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).getTypesWithProperty(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).overwriteDeclaredType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).canPropertyBeDefined(((com.google.javascript.rhino.jstype.JSType)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).incrementGeneration();
    Object v3 = null;
    Object v4 = "0";
    Object v5 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getTypesWithProperty(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "o";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).declareType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).isForwardDeclaredType(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createParameterizedType(((com.google.javascript.rhino.jstype.ObjectType)v5),((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).resolveTypesInScope(((com.google.javascript.rhino.jstype.StaticScope)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.empty();
    Object v9 = com.google.javascript.rhino.IR.empty();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = false;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.rhino.IR.empty();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = "b";
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v15).getTypesWithProperty(((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.IR.empty();
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = com.google.javascript.rhino.IR.empty();
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = false;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.IR.empty();
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = false;
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v33 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v34 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v27),((java.lang.Object)v28),((java.lang.Object)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createRecordType(((java.util.Map)v34));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = false;
    Object v13 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v11),(((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v19 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionTypeWithNewReturnType(((com.google.javascript.rhino.jstype.FunctionType)v14),((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getGreatestSubtypeWithProperty(((com.google.javascript.rhino.jstype.JSType)v24),((java.lang.String)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "UR";
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).hasNamespace(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v9).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).getPossibleToBooleanOutcomes();
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createDefaultObjectUnion(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = false;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = false;
    Object v14 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v12),(((java.lang.Boolean)v13).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).declareType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createOptionalType(((com.google.javascript.rhino.jstype.JSType)v9));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).unregisterPropertyOnType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v6));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).unregisterPropertyOnType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = false;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "*";
    Object v10 = ",";
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).getType(((com.google.javascript.rhino.jstype.StaticScope)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "";
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).getGreatestSubtypeWithProperty(((com.google.javascript.rhino.jstype.JSType)v13),((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v6));
    Object v8 = "z";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).registerTypeImplementingInterface(((com.google.javascript.rhino.jstype.FunctionType)v7),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = com.google.javascript.rhino.IR.empty();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.IR.empty();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = "b";
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v10).getTypesWithProperty(((java.lang.String)v11));
    Object v13 = com.google.javascript.rhino.IR.empty();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = com.google.javascript.rhino.IR.empty();
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = false;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.IR.empty();
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = false;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v28 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v26).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v27));
    Object v29 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v28));
    Object v30 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createRecordType(((java.util.Map)v29));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getErrorReporter();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = "";
    Object v12 = ((com.google.javascript.rhino.jstype.StaticScope)v10).getOwnSlot(((java.lang.String)v11));
    Object v13 = "Paths must both be relative or both absolute.\n  basePaZth: ";
    Object v14 = "";
    Object v15 = 0;
    Object v16 = -12;
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getType(((com.google.javascript.rhino.jstype.StaticScope)v10),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).declareType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createNativeAnonymousObjectType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createNullableType(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getResolveMode();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = false;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
    Object v10 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = false;
    Object v16 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v14),(((java.lang.Boolean)v15).booleanValue()),((com.google.javascript.rhino.jstype.JSType[])v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v22 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v20).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createFunctionTypeWithNewReturnType(((com.google.javascript.rhino.jstype.FunctionType)v17),((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getGreatestSubtypeWithProperty(((com.google.javascript.rhino.jstype.JSType)v27),((java.lang.String)v28));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createParameterizedType(((com.google.javascript.rhino.jstype.ObjectType)v29),((com.google.javascript.rhino.jstype.JSType)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).createNativeAnonymousObjectType();
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createObjectType(((com.google.javascript.rhino.jstype.ObjectType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getType(((com.google.javascript.rhino.jstype.StaticScope)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createNativeAnonymousObjectType();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "@";
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v9).getEachReferenceTypeWithProperty(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createFunctionTypeWithVarArgs(((com.google.javascript.rhino.jstype.JSType)v6),((java.util.List)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).getNativeFunctionType(((com.google.javascript.rhino.jstype.JSTypeNative)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "o";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v8).getNativeFunctionType(((com.google.javascript.rhino.jstype.JSTypeNative)v9));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v11));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).registerPropertyOnType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Z,";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createNativeAnonymousObjectType();
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).registerPropertyOnType(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeNative[]{null};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "U2U_CONSTRUCTOR_TYPE";
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).getEachReferenceTypeWithProperty(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.empty();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "F";
    Object v14 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v12).getTypesWithProperty(((java.lang.String)v13));
    Object v15 = new com.google.javascript.rhino.jstype.UnionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.util.Collection)v14));
    Object v16 = new com.google.javascript.rhino.jstype.EnumType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4),((java.lang.String)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).createDefaultObjectUnion(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeNative[]{null,null,null};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).incrementGeneration();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v5));
    Object v7 = "E";
    Object v8 = ((com.google.javascript.rhino.jstype.StaticScope)v6).getOwnSlot(((java.lang.String)v7));
    Object v9 = "\n";
    Object v10 = "I";
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).getType(((com.google.javascript.rhino.jstype.StaticScope)v6),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v3));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).incrementGeneration();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v4).createNativeAnonymousObjectType();
    Object v6 = "Y";
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).canPropertyBeDefined(((com.google.javascript.rhino.jstype.JSType)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Y";
    Object v4 = com.google.javascript.rhino.IR.empty();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = false;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.rhino.jstype.JSType[]{null};
    Object v13 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v7).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v11),((com.google.javascript.rhino.jstype.JSType[])v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isNullable();
    Object v15 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createEnumType(((java.lang.String)v3),((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "e";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createNativeAnonymousObjectType();
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).registerPropertyOnType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.JSType[]{null,null,null};
    Object v4 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "prototype";
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).getType(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "@";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).identifyNonNullableName(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).getType(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = false;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = true;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v6));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).resolveTypesInScope(((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = false;
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeNative[]{};
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v5).createUnionType(((com.google.javascript.rhino.jstype.JSTypeNative[])v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).declareType(((java.lang.String)v2),((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }
}
