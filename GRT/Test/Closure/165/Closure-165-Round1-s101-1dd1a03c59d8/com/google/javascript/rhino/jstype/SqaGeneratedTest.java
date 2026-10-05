package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "js/%s.js";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getOwnSlot(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getJSDocInfo();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getConstructor();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getImplicitPrototype();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getParameterType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "i";
    Object v8 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getImplicitPrototype();
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getSlot(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getConstructor();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).toObjectType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "i";
    Object v16 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toString();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    ((com.google.javascript.rhino.jstype.ObjectType)v4).collectPropertyNames(((java.util.Set)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "i";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "i";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getOwnSlot(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "prototye";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).hasOwnDeclaredProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isPropertyTypeInferred(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "i";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v4),((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getReferenceName();
    org.junit.Assert.assertEquals((Object)("i"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderShallowEquality(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "i";
    Object v14 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "#";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).hasProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getPossibleToBooleanOutcomes();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new java.util.TreeSet();
    ((com.google.javascript.rhino.jstype.ObjectType)v4).collectPropertyNames(((java.util.Set)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "i";
    Object v16 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v10).resolve(((com.google.javascript.rhino.ErrorReporter)v11),((com.google.javascript.rhino.jstype.StaticScope)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getNormalizedReferenceName();
    org.junit.Assert.assertEquals((Object)("i"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "i";
    Object v24 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v19).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v19).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v3).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "i";
    Object v13 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v3).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isPropertyTypeInferred(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isGlobalThisType();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getConstructor();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).autobox();
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getConstructor();
    Object v7 = ")";
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v5).hasProperty(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "i";
    Object v8 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = "Err~r";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v8).getPropertyType(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v3),((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).differsFrom(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = "\\nH";
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = "Objec";
    Object v20 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v19));
    Object v21 = "Objec";
    Object v22 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v20).srcrefTree(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.ObjectType)v11).defineDeclaredProperty(((java.lang.String)v12),((com.google.javascript.rhino.jstype.JSType)v18),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "i";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "i";
    Object v18 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v6).resolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v11).getReferenceName();
    org.junit.Assert.assertEquals((Object)("i"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v13).getCtorImplementedInterfaces();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "i";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "i";
    Object v18 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v6).resolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).isBooleanObjectType();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.ObjectType)v19).getJSDocInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getOwnPropertyNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "[";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isUnknownType();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = "Err~r";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v5).detectImplicitPrototypeCycle();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).autobox();
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isNumberObjectType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).autobox();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v3).differsFrom(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNoResolvedType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "[";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "i";
    Object v16 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.lang.String)v15));
    Object v17 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v11).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v11).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "i";
    Object v24 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),((java.lang.String)v23));
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = "i";
    Object v30 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v24).resolve(((com.google.javascript.rhino.ErrorReporter)v25),((com.google.javascript.rhino.jstype.StaticScope)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v19).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v11).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getParentScope();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).toMaybeEnumType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "i";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = "Err~r";
    Object v11 = ((com.google.javascript.rhino.jstype.ObjectType)v9).getPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getCtorExtendedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "[";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = "Err~r";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "i";
    Object v19 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "i";
    Object v25 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v19).resolve(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = "ECMASC#IPT5";
    Object v30 = ((com.google.javascript.rhino.jstype.ObjectType)v6).getSlot(((java.lang.String)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getJSDocInfo();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "i";
    Object v18 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "i";
    Object v24 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v18).resolve(((com.google.javascript.rhino.ErrorReporter)v19),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = true;
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = "i";
    Object v30 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).toString();
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v18).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v30));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v13).isSubtype(((com.google.javascript.rhino.jstype.JSType)v32));
    Object v34 = new java.util.TreeSet();
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v13).equals(((java.lang.Object)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = "[";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v5).testForEquality(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "i";
    Object v25 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),((java.lang.String)v24));
    Object v26 = "[";
    Object v27 = ((com.google.javascript.rhino.jstype.ObjectType)v25).getPropertyType(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v19).forceResolve(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v27));
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v19).isInstanceType();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).autobox();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = "Err~r";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v12).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v5).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v11).resolve(((com.google.javascript.rhino.ErrorReporter)v12),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = "Objec";
    Object v21 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v19).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isPropertyTypeDeclared(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "i";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "i";
    Object v18 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v6).resolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "i";
    Object v25 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),((java.lang.String)v24));
    Object v26 = "Err~r";
    Object v27 = ((com.google.javascript.rhino.jstype.ObjectType)v25).getPropertyType(((java.lang.String)v26));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = "i";
    Object v32 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),((java.lang.String)v31));
    Object v33 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v27).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v20).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v13).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).restrictByNotNullOrUndefined();
    Object v6 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    ((com.google.javascript.rhino.jstype.ObjectType)v4).collectPropertyNames(((java.util.Set)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).resolve(((com.google.javascript.rhino.ErrorReporter)v5),((com.google.javascript.rhino.jstype.StaticScope)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "i";
    Object v16 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v16).toString();
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v10).restrictByNotNullOrUndefined();
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isImplicitPrototype(((com.google.javascript.rhino.jstype.ObjectType)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getParameterType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).canBeCalled();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).hasOwnDeclaredProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "i";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "i";
    Object v18 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v12).resolve(((com.google.javascript.rhino.ErrorReporter)v13),((com.google.javascript.rhino.jstype.StaticScope)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v6).resolve(((com.google.javascript.rhino.ErrorReporter)v7),((com.google.javascript.rhino.jstype.StaticScope)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.ObjectType)v20).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "i";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = "Err~r";
    Object v13 = ((com.google.javascript.rhino.jstype.ObjectType)v11).getPropertyType(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "i";
    Object v19 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "i";
    Object v25 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v19).resolve(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v13).resolve(((com.google.javascript.rhino.ErrorReporter)v14),((com.google.javascript.rhino.jstype.StaticScope)v26));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = true;
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v27).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.ObjectType)v6).testForEquality(((com.google.javascript.rhino.jstype.JSType)v27));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ".";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isPropertyTypeDeclared(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "i";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = "[";
    Object v12 = ((com.google.javascript.rhino.jstype.ObjectType)v10).getPropertyType(((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "i";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = "Err~r";
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v17).getPropertyType(((java.lang.String)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "i";
    Object v25 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),((java.lang.String)v24));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "i";
    Object v31 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v25).resolve(((com.google.javascript.rhino.ErrorReporter)v26),((com.google.javascript.rhino.jstype.StaticScope)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v19).resolve(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v32));
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v12).differsFrom(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = "Objec";
    Object v36 = com.google.javascript.rhino.IR.labelName(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.ObjectType)v4).defineInferredProperty(((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSType)v12),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "i";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "Err~r";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.VoidType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.JSType)v3).autobox();
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getNormalizedReferenceName();
    org.junit.Assert.assertNull(v5);
  }
}
