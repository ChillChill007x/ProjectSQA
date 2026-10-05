package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).hasProperty(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toString();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getReferenceName();
    Object v4 = "?-";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).removeProperty(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).autoboxesTo();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.ObjectType)v2).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "t";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyTypeInferred(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v12).getPropertyNames();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toAnnotationString();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).getOwnPropertyJSDocInfo(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "j";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyInExterns(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesNumberContext();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v3).testForEquality(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getReferenceName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.rhino.jstype.RecordType)v0).isSynthetic();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getOwnSlot(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v12).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toAnnotationString();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v2).differsFrom(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "H";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.rhino.IR.trueNode();
    Object v8 = com.google.javascript.rhino.IR.trueNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineDeclaredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v6));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "Q";
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isString();
    Object v8 = com.google.javascript.rhino.IR.trueNode();
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v2).defineInferredProperty(((java.lang.String)v3),((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).unboxesTo();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isCheckedUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isStringValueType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "Unreferenced var: ";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).isPropertyInExterns(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getOwnPropertyNames();
    Object v8 = "D";
    Object v9 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).removeProperty(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).matchesInt32Context();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v3).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).getPossibleToBooleanOutcomes();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).hashCode();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v15).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v21 = com.google.javascript.rhino.IR.trueNode();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v20).equals(((java.lang.Object)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v7).unboxesTo();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).setPropertyJSDocInfo(((java.lang.String)v3),((com.google.javascript.rhino.JSDocInfo)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).isNativeObjectType();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = new com.google.javascript.rhino.JSDocInfo();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).isPropertyInExterns(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isString();
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4));
    Object v6 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).autobox();
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v2).testForEquality(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.TRUE), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.rhino.IR.trueNode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ",";
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v12).findPropertyType(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v3).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "runCustomPas|es";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).hasProperty(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ObjectType)v4).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v5));
    Object v6 = null;
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).canBeCalled();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = "L";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v1).identifyNonNullableName(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).isGlobalThisType();
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v27).toObjectType();
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v31));
    Object v33 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v33).matchesNumberContext();
    Object v35 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v24),((java.lang.Object)v28),((java.lang.Object)v29),((java.lang.Object)v30),((java.lang.Object)v34));
    Object v36 = true;
    Object v37 = new com.google.javascript.rhino.jstype.RecordType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1),((java.util.Map)v35),(((java.lang.Boolean)v36).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = "Q| ";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).isPropertyTypeDeclared(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).toObjectType();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).autobox();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v2).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v2).isBooleanObjectType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.jstype.RecordType.isSubtype(((com.google.javascript.rhino.jstype.ObjectType)v4),((com.google.javascript.rhino.jstype.RecordType)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).hashCode();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v2).isOrdinaryFunction();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.rhino.IR.trueNode();
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).equals(((java.lang.Object)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v11).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v19).hashCode();
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v16).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v22 = ",";
    Object v23 = ((com.google.javascript.rhino.jstype.ObjectType)v21).findPropertyType(((java.lang.String)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v6).differsFrom(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ",";
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v14).isStringValueType();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).hashCode();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v13).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v19 = ",";
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v18).findPropertyType(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "(unknown line)";
    Object v8 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getPropertyNode(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getParameterType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "Nested loops Vare forbidden";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyNode(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v8).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).hashCode();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v13).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v19 = ",";
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v18).findPropertyType(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v21).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getTypeOfThis();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "u";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).removeProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getTypeOfThis();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).hashCode();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v15).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v21 = ",";
    Object v22 = ((com.google.javascript.rhino.jstype.ObjectType)v20).findPropertyType(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v7).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("()"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v13).getTypeOfThis();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v6).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isUnknownType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ",";
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v14).findPropertyType(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getTypeOfThis();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v7).differsFrom(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = "L";
    Object v13 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v7).isPropertyInExterns(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getCtorExtendedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v6).getReferenceName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.JSType)v2).toObjectType();
    Object v4 = ")";
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v3).getOwnSlot(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getTypeOfThis();
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getOwnSlot(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getTypeOfThis();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v10).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).hashCode();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v15).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v21 = ",";
    Object v22 = ((com.google.javascript.rhino.jstype.ObjectType)v20).findPropertyType(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = ((com.google.javascript.rhino.jstype.ObjectType)v22).findPropertyType(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v7).isSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v7).isNativeObjectType();
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = ",";
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v12).findPropertyType(((java.lang.String)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = "";
    Object v19 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v17).getPropertyType(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v14).differsFrom(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v14).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).getOwnPropertyJSDocInfo(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getTypeOfThis();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).toObjectType();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v11).autobox();
    Object v13 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).matchesStringContext();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v9).toObjectType();
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v6).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v2).getPropertyType(((java.lang.String)v3));
    Object v5 = "1";
    Object v6 = ((com.google.javascript.rhino.jstype.PrototypeObjectType)v4).hasProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0));
    Object v2 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v1));
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v2).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v5));
    Object v7 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v2));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).hashCode();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.rhino.jstype.NoObjectType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v16).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v19));
    Object v21 = com.google.javascript.rhino.IR.trueNode();
    Object v22 = ((com.google.javascript.rhino.jstype.ObjectType)v12).defineInferredProperty(((java.lang.String)v13),((com.google.javascript.rhino.jstype.JSType)v20),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }
}
