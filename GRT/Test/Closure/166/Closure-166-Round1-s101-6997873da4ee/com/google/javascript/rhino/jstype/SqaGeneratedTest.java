package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isSubtype(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v2).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v2).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "t";
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).hasOwnProperty(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v2).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    ((com.google.javascript.rhino.jstype.JSType)v2).clearResolved();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasReferenceName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).toStringHelper((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)("OYFF"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isString();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyType(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNumber();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = "OYFF";
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toString();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5),((java.lang.String)v6),((com.google.javascript.rhino.jstype.ObjectType)v9),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v2).differsFrom(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ",";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.rhino.IR.breakNode();
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineDeclaredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.Node)v7));
    Object v9 = "&";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasProperty(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isBooleanObjectType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).hashCode();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).toMaybeUnionType();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).unboxesTo();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = true;
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).toStringHelper((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("?"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.IR.breakNode();
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v8).defineInferredProperty(((java.lang.String)v9),((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.Node)v13));
    Object v15 = "&";
    Object v16 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).getPropertyNode(((java.lang.String)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v8).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v8).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).getPropertyType(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isSubtype(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).removeProperty(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).toStringHelper((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)("OYFF"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).isObject();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v14).getPropertyType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v8).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).removeProperty(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toMaybeEnumType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "JSCompNiler_set";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).isPropertyTypeDeclared(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isGlobalThisType();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).setImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    ((com.google.javascript.rhino.jstype.JSType)v11).clearResolved();
    Object v12 = null;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertiesCount();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = false;
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v8).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "functon";
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = "OYFF";
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v17).toString();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14),((com.google.javascript.rhino.jstype.ObjectType)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "+";
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v20).findPropertyType(((java.lang.String)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.rhino.IR.breakNode();
    Object v25 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v24).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).defineProperty(((java.lang.String)v11),((com.google.javascript.rhino.jstype.JSType)v20),(((java.lang.Boolean)v23).booleanValue()),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).getPropertiesCount();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v5).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v10));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchConstraint(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).getOwnPropertyJSDocInfo(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).matchRecordTypeConstraint(((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v8).getNormalizedReferenceName();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v8).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = "OYFF";
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toString();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.lang.String)v12),((com.google.javascript.rhino.jstype.ObjectType)v15),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = "";
    Object v24 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v22).getPropertyType(((java.lang.String)v23));
    Object v25 = "w";
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26));
    Object v28 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
    Object v29 = com.google.javascript.rhino.IR.breakNode();
    Object v30 = ((com.google.javascript.rhino.jstype.ObjectType)v24).defineDeclaredProperty(((java.lang.String)v25),((com.google.javascript.rhino.jstype.JSType)v28),((com.google.javascript.rhino.Node)v29));
    Object v31 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v32 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v32));
    Object v34 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v24).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v31),((com.google.javascript.rhino.jstype.StaticScope)v34));
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v35).toObjectType();
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v19).testForEquality(((com.google.javascript.rhino.jstype.JSType)v36));
    Object v38 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isString();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getOwnerFunction();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = true;
    Object v8 = com.google.javascript.rhino.IR.breakNode();
    Object v9 = ((com.google.javascript.rhino.Node)v8).isNoSideEffectsCall();
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).defineProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v6),(((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "`";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getSlot(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v9).findPropertyType(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).getPropertiesCount();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).isSubtype(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getDisplayName();
    Object v6 = "Cou]ld not resolve type in {0} tag of {1}";
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).isPropertyTypeInferred(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "prototype";
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).hasOwnProperty(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "OYFF";
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).toString();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((com.google.javascript.rhino.jstype.ObjectType)v21),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v15).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v18).getPropertiesCount();
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21));
    Object v23 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v18).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v23));
    Object v25 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v15).isSubtype(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v8).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = "";
    Object v21 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v19).getPropertyType(((java.lang.String)v20));
    Object v22 = "w";
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = com.google.javascript.rhino.IR.breakNode();
    Object v27 = ((com.google.javascript.rhino.jstype.ObjectType)v21).defineDeclaredProperty(((java.lang.String)v22),((com.google.javascript.rhino.jstype.JSType)v25),((com.google.javascript.rhino.Node)v26));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v21).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v28),((com.google.javascript.rhino.jstype.StaticScope)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v32).toObjectType();
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v16).matchRecordTypeConstraint(((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).getPropertiesCount();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v16));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).setOwnerFunction(((com.google.javascript.rhino.jstype.FunctionType)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toAnnotationString();
    org.junit.Assert.assertEquals((Object)("?"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = "w";
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.IR.breakNode();
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v14).defineDeclaredProperty(((java.lang.String)v15),((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v14).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v21),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).toObjectType();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = "";
    Object v11 = " ";
    Object v12 = 21;
    Object v13 = -2;
    ((com.google.javascript.rhino.ErrorReporter)v9).error(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v17).getPropertiesCount();
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v17).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v8).resolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isBooleanObjectType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getJSDocInfo();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).getPropertiesCount();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).hashCode();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = "OYFF";
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toString();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13),((com.google.javascript.rhino.jstype.ObjectType)v16),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.rhino.IR.breakNode();
    Object v22 = com.google.javascript.rhino.IR.breakNode();
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).toAnnotationString();
    Object v27 = new com.google.javascript.rhino.JSDocInfo();
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v30).getCtorImplementedInterfaces();
    Object v32 = com.google.javascript.rhino.IR.breakNode();
    Object v33 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v31),((java.lang.Object)v32));
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).collectPropertyNames(((java.util.Set)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = ((com.google.javascript.rhino.jstype.ObjectType)v16).getJSDocInfo();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).toMaybeEnumType();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toString();
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getIndexType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v8).getConstructor();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getCtorImplementedInterfaces();
    Object v11 = "d";
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getOwnPropertyJSDocInfo(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).getPropertiesCount();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v11).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v8).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v8).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ";";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).hasProperty(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertiesCount();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v13).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertiesCount();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v3),((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v14 = "h";
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v13).getOwnPropertyJSDocInfo(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).hasAnyTemplate();
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v9).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = "w";
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.IR.breakNode();
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v14).defineDeclaredProperty(((java.lang.String)v15),((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v14).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v21),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).toObjectType();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = "]";
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v31).getPropertiesCount();
    Object v33 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v34 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v34));
    Object v36 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v31).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v33),((com.google.javascript.rhino.jstype.StaticScope)v36));
    Object v38 = com.google.javascript.rhino.IR.breakNode();
    Object v39 = ((com.google.javascript.rhino.jstype.ObjectType)v27).defineInferredProperty(((java.lang.String)v28),((com.google.javascript.rhino.jstype.JSType)v37),((com.google.javascript.rhino.Node)v38));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v8).getOwnSlot(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v8).getOwnSlot(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "OYFF";
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.lang.String)v2),((com.google.javascript.rhino.jstype.ObjectType)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = "arg";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).isPropertyTypeInferred(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertiesCount();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v4),((com.google.javascript.rhino.jstype.StaticScope)v7));
    Object v9 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v12).getPropertyType(((java.lang.String)v13));
    Object v15 = "w";
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.IR.breakNode();
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v14).defineDeclaredProperty(((java.lang.String)v15),((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v14).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v21),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v25).toObjectType();
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v27).getOwnPropertyJSDocInfo(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v27).matchesObjectContext();
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "w";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.rhino.IR.breakNode();
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineDeclaredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v15).toObjectType();
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).autobox();
    org.junit.Assert.assertNotNull(v17);
  }
}
